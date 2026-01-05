package p001o;

import com.google.android.gms.cast.MediaStatus;

/* loaded from: classes2.dex */
public final class byf {

    /* renamed from: a */
    public final zwc f16971a = new zwc(8);

    /* renamed from: b */
    public int f16972b;

    /* renamed from: a */
    public final long m19925a(uq6 uq6Var) {
        int i = 0;
        uq6Var.mo40498m(this.f16971a.m60024e(), 0, 1);
        int i2 = this.f16971a.m60024e()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        uq6Var.mo40498m(this.f16971a.m60024e(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f16971a.m60024e()[i] & 255) + (i5 << 8);
        }
        this.f16972b += i4 + 1;
        return i5;
    }

    /* renamed from: b */
    public boolean m19926b(uq6 uq6Var) {
        long length = uq6Var.getLength();
        long j = MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        if (length != -1 && length <= MediaStatus.COMMAND_QUEUE_REPEAT_ALL) {
            j = length;
        }
        int i = (int) j;
        uq6Var.mo40498m(this.f16971a.m60024e(), 0, 4);
        long jM60006J = this.f16971a.m60006J();
        this.f16972b = 4;
        while (jM60006J != 440786851) {
            int i2 = this.f16972b + 1;
            this.f16972b = i2;
            if (i2 == i) {
                return false;
            }
            uq6Var.mo40498m(this.f16971a.m60024e(), 0, 1);
            jM60006J = ((jM60006J << 8) & (-256)) | (this.f16971a.m60024e()[0] & 255);
        }
        long jM19925a = m19925a(uq6Var);
        long j2 = this.f16972b;
        if (jM19925a == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + jM19925a >= length) {
            return false;
        }
        while (true) {
            int i3 = this.f16972b;
            long j3 = j2 + jM19925a;
            if (i3 >= j3) {
                return ((long) i3) == j3;
            }
            if (m19925a(uq6Var) == Long.MIN_VALUE) {
                return false;
            }
            long jM19925a2 = m19925a(uq6Var);
            if (jM19925a2 < 0 || jM19925a2 > 2147483647L) {
                break;
            }
            if (jM19925a2 != 0) {
                int i4 = (int) jM19925a2;
                uq6Var.mo40494h(i4);
                this.f16972b += i4;
            }
        }
        return false;
    }
}
