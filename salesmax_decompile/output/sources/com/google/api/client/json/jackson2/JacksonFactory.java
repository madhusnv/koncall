package com.google.api.client.json.jackson2;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import p001o.b99;
import p001o.s89;
import p001o.x89;
import p001o.ya9;

/* loaded from: classes3.dex */
public final class JacksonFactory extends JsonFactory {
    private final x89 factory;

    /* renamed from: com.google.api.client.json.jackson2.JacksonFactory$1 */
    public static /* synthetic */ class C112581 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[ya9.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                iArr[ya9.END_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.START_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.VALUE_STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9.FIELD_NAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class InstanceHolder {
        static final JacksonFactory INSTANCE = new JacksonFactory();
    }

    public JacksonFactory() {
        x89 x89Var = new x89();
        this.factory = x89Var;
        x89Var.m55829o(b99.EnumC12329a.AUTO_CLOSE_JSON_CONTENT, false);
    }

    public static JsonToken convert(ya9 ya9Var) {
        if (ya9Var == null) {
            return null;
        }
        switch (C112581.$SwitchMap$com$fasterxml$jackson$core$JsonToken[ya9Var.ordinal()]) {
            case 1:
                return JsonToken.END_ARRAY;
            case 2:
                return JsonToken.START_ARRAY;
            case 3:
                return JsonToken.END_OBJECT;
            case 4:
                return JsonToken.START_OBJECT;
            case 5:
                return JsonToken.VALUE_FALSE;
            case 6:
                return JsonToken.VALUE_TRUE;
            case 7:
                return JsonToken.VALUE_NULL;
            case 8:
                return JsonToken.VALUE_STRING;
            case 9:
                return JsonToken.VALUE_NUMBER_FLOAT;
            case 10:
                return JsonToken.VALUE_NUMBER_INT;
            case 11:
                return JsonToken.FIELD_NAME;
            default:
                return JsonToken.NOT_AVAILABLE;
        }
    }

    public static JacksonFactory getDefaultInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonGenerator createJsonGenerator(OutputStream outputStream, Charset charset) {
        return new JacksonGenerator(this, this.factory.m55832r(outputStream, s89.UTF8));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(Reader reader) {
        Preconditions.checkNotNull(reader);
        return new JacksonParser(this, this.factory.m55835u(reader));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonGenerator createJsonGenerator(Writer writer) {
        return new JacksonGenerator(this, this.factory.m55833s(writer));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
        return new JacksonParser(this, this.factory.m55834t(inputStream));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream, Charset charset) {
        Preconditions.checkNotNull(inputStream);
        return new JacksonParser(this, this.factory.m55834t(inputStream));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(String str) {
        Preconditions.checkNotNull(str);
        return new JacksonParser(this, this.factory.m55836x(str));
    }
}
