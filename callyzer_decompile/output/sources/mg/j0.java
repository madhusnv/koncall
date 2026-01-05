package mg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Arrays;
import m2.C4640e;
import og.C5384y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    public int f23654a;

    /* renamed from: b */
    public boolean f23655b;

    /* renamed from: c */
    public Object f23656c;

    public j0(int i10) {
        switch (i10) {
            case 3:
                this.f23654a = -1;
                this.f23656c = new C4640e(new s1.g0[16]);
                break;
            default:
                this.f23656c = new Object[4];
                this.f23654a = 0;
                break;
        }
    }

    /* renamed from: a */
    public void m9620a(Object obj) {
        obj.getClass();
        m9621b(this.f23654a + 1);
        Object[] objArr = (Object[]) this.f23656c;
        int i10 = this.f23654a;
        this.f23654a = i10 + 1;
        objArr[i10] = obj;
    }

    /* renamed from: b */
    public void m9621b(int i10) {
        Object[] objArr = (Object[]) this.f23656c;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f23655b) {
                this.f23656c = (Object[]) objArr.clone();
                this.f23655b = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f23656c = Arrays.copyOf(objArr, i11);
        this.f23655b = false;
    }

    /* renamed from: c */
    public og.e0 m9622c() {
        this.f23655b = true;
        Object[] objArr = (Object[]) this.f23656c;
        int i10 = this.f23654a;
        C5384y c5384y = og.a0.f26308b;
        return i10 == 0 ? og.e0.f26386e : new og.e0(i10, objArr);
    }

    public j0(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f23656c = messageDigest;
        this.f23654a = i10;
    }
}
