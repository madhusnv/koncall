package androidx.work;

import androidx.work.Data;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class ArrayCreatingInputMerger extends InputMerger {
    private final Object concatenateArrayAndNonArray(Object obj, Object obj2, Class<?> cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        sq8.m48648g(objNewInstance, "newArray");
        return objNewInstance;
    }

    private final Object concatenateArrays(Object obj, Object obj2) throws NegativeArraySizeException {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        sq8.m48646e(componentType);
        Object objNewInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        sq8.m48648g(objNewInstance, "newArray");
        return objNewInstance;
    }

    private final Object createArrayFor(Object obj, Class<?> cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance = Array.newInstance(cls, 1);
        Array.set(objNewInstance, 0, obj);
        sq8.m48648g(objNewInstance, "newArray");
        return objNewInstance;
    }

    @Override // androidx.work.InputMerger
    public Data merge(List<Data> list) throws Throwable {
        sq8.m48649h(list, "inputs");
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            Map<String, Object> keyValueMap = it.next().getKeyValueMap();
            sq8.m48648g(keyValueMap, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                sq8.m48648g(key, TransferTable.COLUMN_KEY);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (sq8.m48644c(cls2, cls)) {
                        sq8.m48648g(value, "value");
                        value = concatenateArrays(obj, value);
                    } else {
                        if (!sq8.m48644c(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = concatenateArrayAndNonArray(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = createArrayFor(value, cls);
                }
                sq8.m48648g(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        builder.putAll(map);
        Data dataBuild = builder.build();
        sq8.m48648g(dataBuild, "output.build()");
        return dataBuild;
    }
}
