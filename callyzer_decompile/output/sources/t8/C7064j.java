package t8;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import og.mg;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.j */
/* loaded from: classes.dex */
public final class C7064j {

    /* renamed from: b */
    public static final C7064j f34159b;

    /* renamed from: a */
    public final HashMap f34160a;

    static {
        C7064j c7064j = new C7064j(new LinkedHashMap());
        mg.m10769b(c7064j);
        f34159b = c7064j;
    }

    public C7064j(C7064j other) {
        AbstractC4154l.m8923f(other, "other");
        this.f34160a = new HashMap(other.f34160a);
    }

    /* renamed from: a */
    public static final C7064j m13364a(byte[] bytes) throws IOException {
        AbstractC4154l.m8923f(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return f34159b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            int i10 = 0;
            boolean z6 = bArr[0] == ((byte) 16777132) && bArr[1] == ((byte) (-21267));
            byteArrayInputStream.reset();
            if (z6) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i11 = objectInputStream.readInt();
                    while (i10 < i11) {
                        String utf = objectInputStream.readUTF();
                        AbstractC4154l.m8922e(utf, "readUTF()");
                        linkedHashMap.put(utf, objectInputStream.readObject());
                        i10++;
                    }
                    objectInputStream.close();
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s5 = dataInputStream.readShort();
                    if (s5 != -21521) {
                        throw new IllegalStateException(AbstractC4801l.m9730d(s5, "Magic number doesn't match: ").toString());
                    }
                    short s10 = dataInputStream.readShort();
                    if (s10 != 1) {
                        throw new IllegalStateException(AbstractC4801l.m9730d(s10, "Unsupported version number: ").toString());
                    }
                    int i12 = dataInputStream.readInt();
                    while (i10 < i12) {
                        Serializable serializableM10768a = mg.m10768a(dataInputStream, dataInputStream.readByte());
                        String key = dataInputStream.readUTF();
                        AbstractC4154l.m8922e(key, "key");
                        linkedHashMap.put(key, serializableM10768a);
                        i10++;
                    }
                    dataInputStream.close();
                } finally {
                }
            }
        } catch (IOException unused) {
            int i13 = AbstractC7065k.f34162a;
            C7077w.m13371a().getClass();
        } catch (ClassNotFoundException unused2) {
            int i14 = AbstractC7065k.f34162a;
            C7077w.m13371a().getClass();
        }
        return new C7064j(linkedHashMap);
    }

    /* renamed from: b */
    public final boolean m13365b(String str) {
        Object obj = Boolean.FALSE;
        Object obj2 = this.f34160a.get(str);
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: c */
    public final Map m13366c() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f34160a);
        AbstractC4154l.m8922e(mapUnmodifiableMap, "unmodifiableMap(values)");
        return mapUnmodifiableMap;
    }

    /* renamed from: d */
    public final String m13367d(String str) {
        Object obj = this.f34160a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m13368e(String str) {
        Object obj = this.f34160a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L66
        L5:
            r1 = 0
            if (r9 == 0) goto L67
            java.lang.Class<t8.j> r2 = t8.C7064j.class
            java.lang.Class r3 = r9.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            t8.j r9 = (t8.C7064j) r9
            java.util.HashMap r9 = r9.f34160a
            java.util.HashMap r2 = r8.f34160a
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r4)
            if (r4 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5e
            if (r4 != 0) goto L47
            goto L5e
        L47:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L59
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = rw.AbstractC6662l.m12714d(r6, r4)
            goto L63
        L59:
            boolean r4 = r5.equals(r4)
            goto L63
        L5e:
            if (r5 != r4) goto L62
            r4 = r0
            goto L63
        L62:
            r4 = r1
        L63:
            if (r4 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.C7064j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f34160a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return AbstractC5601a.m11241l(new StringBuilder("Data {"), AbstractC6663m.m12748L(this.f34160a.entrySet(), null, null, null, C7063i.f34158a, 31), "}", "StringBuilder().apply(builderAction).toString()");
    }

    public C7064j(LinkedHashMap values) {
        AbstractC4154l.m8923f(values, "values");
        this.f34160a = new HashMap(values);
    }
}
