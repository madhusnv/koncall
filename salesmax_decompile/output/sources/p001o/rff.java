package p001o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class rff implements eff, Serializable {

    /* renamed from: d */
    public static final va9 f43509d = va9.m52497d();

    /* renamed from: a */
    public final String f43510a;

    /* renamed from: b */
    public byte[] f43511b;

    /* renamed from: c */
    public transient String f43512c;

    public rff(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f43510a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f43512c = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f43510a);
    }

    @Override // p001o.eff
    /* renamed from: a */
    public int mo24954a(char[] cArr, int i) {
        String str = this.f43510a;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    @Override // p001o.eff
    /* renamed from: b */
    public int mo24955b(byte[] bArr, int i) {
        byte[] bArrM52498c = this.f43511b;
        if (bArrM52498c == null) {
            bArrM52498c = f43509d.m52498c(this.f43510a);
            this.f43511b = bArrM52498c;
        }
        int length = bArrM52498c.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrM52498c, 0, bArr, i, length);
        return length;
    }

    @Override // p001o.eff
    /* renamed from: c */
    public final byte[] mo24956c() {
        byte[] bArr = this.f43511b;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrM52498c = f43509d.m52498c(this.f43510a);
        this.f43511b = bArrM52498c;
        return bArrM52498c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f43510a.equals(((rff) obj).f43510a);
    }

    @Override // p001o.eff
    public final String getValue() {
        return this.f43510a;
    }

    public final int hashCode() {
        return this.f43510a.hashCode();
    }

    public Object readResolve() {
        return new rff(this.f43512c);
    }

    public final String toString() {
        return this.f43510a;
    }
}
