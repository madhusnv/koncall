package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes6.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    private final Gson context;
    private final TypeAdapter<T> delegate;

    /* renamed from: type, reason: collision with root package name */
    private final Type f58160type;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type2) {
        this.context = gson;
        this.delegate = typeAdapter;
        this.f58160type = type2;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type2, Object obj) {
        return obj != null ? (type2 == Object.class || (type2 instanceof TypeVariable) || (type2 instanceof Class)) ? obj.getClass() : type2 : type2;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public T read2(JsonReader jsonReader) {
        return this.delegate.read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) {
        TypeAdapter<T> adapter = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.f58160type, t);
        if (runtimeTypeIfMoreSpecific != this.f58160type) {
            adapter = this.context.getAdapter(TypeToken.get(runtimeTypeIfMoreSpecific));
            if (adapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (!(typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    adapter = typeAdapter;
                }
            }
        }
        adapter.write(jsonWriter, t);
    }
}
