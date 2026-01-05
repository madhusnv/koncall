package og;

import com.skydoves.balloon.internals.DefinitionKt;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import mm.AbstractC4801l;
import t8.AbstractC7065k;
import t8.C7064j;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class mg {

    /* renamed from: a */
    public static final /* synthetic */ int f26658a = 0;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: a */
    public static final Serializable m10768a(DataInputStream dataInputStream, byte b10) throws IOException {
        if (b10 == 0) {
            return null;
        }
        if (b10 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b10 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b10 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b10 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b10 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b10 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b10 == 7) {
            return dataInputStream.readUTF();
        }
        int i10 = 0;
        if (b10 == 8) {
            int i11 = dataInputStream.readInt();
            ?? r02 = new Boolean[i11];
            while (i10 < i11) {
                r02[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                i10++;
            }
            return r02;
        }
        if (b10 == 9) {
            int i12 = dataInputStream.readInt();
            ?? r03 = new Byte[i12];
            while (i10 < i12) {
                r03[i10] = Byte.valueOf(dataInputStream.readByte());
                i10++;
            }
            return r03;
        }
        if (b10 == 10) {
            int i13 = dataInputStream.readInt();
            ?? r04 = new Integer[i13];
            while (i10 < i13) {
                r04[i10] = Integer.valueOf(dataInputStream.readInt());
                i10++;
            }
            return r04;
        }
        if (b10 == 11) {
            int i14 = dataInputStream.readInt();
            ?? r05 = new Long[i14];
            while (i10 < i14) {
                r05[i10] = Long.valueOf(dataInputStream.readLong());
                i10++;
            }
            return r05;
        }
        if (b10 == 12) {
            int i15 = dataInputStream.readInt();
            ?? r06 = new Float[i15];
            while (i10 < i15) {
                r06[i10] = Float.valueOf(dataInputStream.readFloat());
                i10++;
            }
            return r06;
        }
        if (b10 == 13) {
            int i16 = dataInputStream.readInt();
            ?? r07 = new Double[i16];
            while (i10 < i16) {
                r07[i10] = Double.valueOf(dataInputStream.readDouble());
                i10++;
            }
            return r07;
        }
        if (b10 != 14) {
            throw new IllegalStateException(AbstractC4801l.m9730d(b10, "Unsupported type "));
        }
        int i17 = dataInputStream.readInt();
        ?? r12 = new String[i17];
        while (i10 < i17) {
            String utf = dataInputStream.readUTF();
            if (AbstractC4154l.m8918a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r12[i10] = utf;
            i10++;
        }
        return r12;
    }

    /* renamed from: b */
    public static byte[] m10769b(C7064j data) {
        AbstractC4154l.m8923f(data, "data");
        HashMap map = data.f34160a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    m10770c(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                AbstractC4154l.m8922e(byteArray, "{\n                ByteAr…          }\n            }");
                return byteArray;
            } finally {
            }
        } catch (IOException unused) {
            int i10 = AbstractC7065k.f34162a;
            C7077w.m13371a().getClass();
            return new byte[0];
        }
    }

    /* renamed from: c */
    public static final void m10770c(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i10;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.a0.m8901a(obj.getClass()).m8914c());
            }
            Object[] objArr = (Object[]) obj;
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(objArr.getClass());
            if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Boolean[].class))) {
                i10 = 8;
            } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Byte[].class))) {
                i10 = 9;
            } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Integer[].class))) {
                i10 = 10;
            } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Long[].class))) {
                i10 = 11;
            } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Float[].class))) {
                i10 = 12;
            } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Double[].class))) {
                i10 = 13;
            } else {
                if (!c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.a0.m8901a(objArr.getClass()).m8913b());
                }
                i10 = 14;
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i10 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i10 == 9) {
                    Byte b10 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                } else if (i10 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i10 == 11) {
                    Long l9 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l9 != null ? l9.longValue() : 0L);
                } else if (i10 == 12) {
                    Float f6 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f6 != null ? f6.floatValue() : DefinitionKt.NO_Float_VALUE);
                } else if (i10 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i10 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }
}
