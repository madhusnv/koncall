package com.onesignal.common.services;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.onesignal.debug.internal.logging.Logging;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import p001o.gp0;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class ServiceRegistrationReflection<T> extends ServiceRegistration<T> {
    private final Class<?> clazz;
    private T obj;

    public ServiceRegistrationReflection(Class<?> cls) {
        sq8.m48649h(cls, "clazz");
        this.clazz = cls;
    }

    private final boolean doesHaveAllParameters(Constructor<?> constructor, IServiceProvider iServiceProvider) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        sq8.m48648g(genericParameterTypes, "constructor.genericParameterTypes");
        for (Type type2 : genericParameterTypes) {
            if (type2 instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                sq8.m48648g(actualTypeArguments, "param.actualTypeArguments");
                Type type3 = (Type) gp0.m29258Y(actualTypeArguments);
                if (!(type3 instanceof WildcardType)) {
                    if (type3 instanceof Class) {
                        if (!iServiceProvider.hasService((Class) type3)) {
                            Logging.debug$default("Constructor " + constructor + " could not find service: " + type3, null, 2, null);
                        }
                    }
                    return false;
                }
                Type[] upperBounds = ((WildcardType) type3).getUpperBounds();
                sq8.m48648g(upperBounds, "argType.upperBounds");
                Type type4 = (Type) gp0.m29257X(upperBounds);
                if ((type4 instanceof Class) && !iServiceProvider.hasService((Class) type4)) {
                    Logging.debug$default("Constructor " + constructor + " could not find service: " + type4, null, 2, null);
                    return false;
                }
            } else {
                if (!(type2 instanceof Class)) {
                    Logging.debug$default("Constructor " + constructor + " could not identify param type: " + type2, null, 2, null);
                    return false;
                }
                if (!iServiceProvider.hasService((Class) type2)) {
                    Logging.debug$default("Constructor " + constructor + " could not find service: " + type2, null, 2, null);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.services.ServiceRegistration
    public Object resolve(IServiceProvider iServiceProvider) throws SecurityException {
        sq8.m48649h(iServiceProvider, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        if (this.obj != null) {
            Logging.debug$default(ServiceProvider.Companion.getIndent() + "Already instantiated: " + this.obj, null, 2, null);
            return this.obj;
        }
        Constructor<?>[] constructors = this.clazz.getConstructors();
        sq8.m48648g(constructors, "clazz.constructors");
        int length = constructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i];
            sq8.m48648g(constructor, "constructor");
            if (doesHaveAllParameters(constructor, iServiceProvider)) {
                Logging.debug$default(ServiceProvider.Companion.getIndent() + "Found constructor: " + constructor, null, 2, null);
                ArrayList arrayList = new ArrayList();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                sq8.m48648g(genericParameterTypes, "constructor.genericParameterTypes");
                for (Type type2 : genericParameterTypes) {
                    if (type2 instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                        sq8.m48648g(actualTypeArguments, "param.actualTypeArguments");
                        Type type3 = (Type) gp0.m29258Y(actualTypeArguments);
                        if (type3 instanceof WildcardType) {
                            Type[] upperBounds = ((WildcardType) type3).getUpperBounds();
                            sq8.m48648g(upperBounds, "argType.upperBounds");
                            Type type4 = (Type) gp0.m29257X(upperBounds);
                            if (type4 instanceof Class) {
                                arrayList.add(iServiceProvider.getAllServices((Class) type4));
                            } else {
                                arrayList.add(null);
                            }
                        } else if (type3 instanceof Class) {
                            arrayList.add(iServiceProvider.getAllServices((Class) type3));
                        } else {
                            arrayList.add(null);
                        }
                    } else if (type2 instanceof Class) {
                        arrayList.add(iServiceProvider.getService((Class) type2));
                    } else {
                        arrayList.add(null);
                    }
                }
                Object[] array = arrayList.toArray(new Object[0]);
                sq8.m48647f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                this.obj = (T) constructor.newInstance(Arrays.copyOf(array, array.length));
            } else {
                i++;
            }
        }
        return this.obj;
    }
}
