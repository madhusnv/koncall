package p001o;

import java.io.ByteArrayOutputStream;

/* loaded from: classes6.dex */
public class vp1 extends ByteArrayOutputStream {
    public vp1() {
    }

    /* renamed from: a */
    public byte[] m53158a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    /* renamed from: c */
    public void m53159c(int i) {
        ((ByteArrayOutputStream) this).count = i;
    }

    public int getCount() {
        return ((ByteArrayOutputStream) this).count;
    }

    public vp1(int i) {
        super(i);
    }
}
