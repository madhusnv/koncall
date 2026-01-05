package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class Types {
    private Types() {
    }

    private static Type getActualParameterAtPosition(Type type2, Class<?> cls, int i) {
        Type typeResolveTypeVariable;
        ParameterizedType superParameterizedType = getSuperParameterizedType(type2, cls);
        if (superParameterizedType == null) {
            return null;
        }
        Type type3 = superParameterizedType.getActualTypeArguments()[i];
        return (!(type3 instanceof TypeVariable) || (typeResolveTypeVariable = resolveTypeVariable(Arrays.asList(type2), (TypeVariable) type3)) == null) ? type3 : typeResolveTypeVariable;
    }

    public static Type getArrayComponentType(Type type2) {
        return type2 instanceof GenericArrayType ? ((GenericArrayType) type2).getGenericComponentType() : ((Class) type2).getComponentType();
    }

    public static Type getBound(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
    }

    public static Type getIterableParameter(Type type2) {
        return getActualParameterAtPosition(type2, Iterable.class, 0);
    }

    public static Type getMapValueParameter(Type type2) {
        return getActualParameterAtPosition(type2, Map.class, 1);
    }

    public static Class<?> getRawArrayComponentType(List<Type> list, Type type2) {
        if (type2 instanceof TypeVariable) {
            type2 = resolveTypeVariable(list, (TypeVariable) type2);
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance(getRawArrayComponentType(list, getArrayComponentType(type2)), 0).getClass();
        }
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            return getRawClass((ParameterizedType) type2);
        }
        Preconditions.checkArgument(type2 == null, "wildcard type is not supported: %s", type2);
        return Object.class;
    }

    public static Class<?> getRawClass(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static ParameterizedType getSuperParameterizedType(Type type2, Class<?> cls) {
        Class<?> cls2;
        if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
            return null;
        }
        while (type2 != null && type2 != Object.class) {
            if (type2 instanceof Class) {
                cls2 = (Class) type2;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Class<?> rawClass = getRawClass(parameterizedType);
                if (rawClass == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    for (Type type3 : rawClass.getGenericInterfaces()) {
                        if (cls.isAssignableFrom(type3 instanceof Class ? (Class) type3 : getRawClass((ParameterizedType) type3))) {
                            type2 = type3;
                            break;
                        }
                    }
                }
                cls2 = rawClass;
            }
            type2 = cls2.getGenericSuperclass();
        }
        return null;
    }

    private static IllegalArgumentException handleExceptionForNewInstance(Exception exc, Class<?> cls) throws NoSuchMethodException, SecurityException {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            } else {
                arrayList.add("possibly because it is not public");
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    public static boolean isArray(Type type2) {
        return (type2 instanceof GenericArrayType) || ((type2 instanceof Class) && ((Class) type2).isArray());
    }

    public static boolean isAssignableToOrFrom(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> Iterable<T> iterableOf(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        Preconditions.checkArgument(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new Iterable<T>() { // from class: com.google.api.client.util.Types.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new Iterator<T>() { // from class: com.google.api.client.util.Types.1.1
                    int index = 0;
                    final int length;

                    {
                        this.length = Array.getLength(obj);
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.index < this.length;
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object obj2 = obj;
                        int i = this.index;
                        this.index = i + 1;
                        return (T) Array.get(obj2, i);
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw handleExceptionForNewInstance(e, cls);
        } catch (InstantiationException e2) {
            throw handleExceptionForNewInstance(e2, cls);
        }
    }

    public static Type resolveTypeVariable(List<Type> list, TypeVariable<?> typeVariable) {
        Type typeResolveTypeVariable;
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType superParameterizedType = null;
            while (superParameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                superParameterizedType = getSuperParameterizedType(list.get(size), cls);
            }
            if (superParameterizedType != null) {
                TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type2 = superParameterizedType.getActualTypeArguments()[i];
                return (!(type2 instanceof TypeVariable) || (typeResolveTypeVariable = resolveTypeVariable(list, (TypeVariable) type2)) == null) ? type2 : typeResolveTypeVariable;
            }
        }
        return null;
    }

    public static Object toArray(Collection<?> collection, Class<?> cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object objNewInstance = Array.newInstance(cls, collection.size());
        Iterator<?> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Array.set(objNewInstance, i, it.next());
            i++;
        }
        return objNewInstance;
    }
}
