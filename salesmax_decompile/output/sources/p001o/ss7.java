package p001o;

import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class ss7 {

    /* renamed from: b */
    public ByteBuffer f45862b;

    /* renamed from: c */
    public rs7 f45863c;

    /* renamed from: a */
    public final byte[] f45861a = new byte[256];

    /* renamed from: d */
    public int f45864d = 0;

    /* renamed from: a */
    public void m48835a() {
        this.f45862b = null;
        this.f45863c = null;
    }

    /* renamed from: b */
    public final boolean m48836b() {
        return this.f45863c.f44012b != 0;
    }

    /* renamed from: c */
    public rs7 m48837c() {
        if (this.f45862b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m48836b()) {
            return this.f45863c;
        }
        m48845k();
        if (!m48836b()) {
            m48842h();
            rs7 rs7Var = this.f45863c;
            if (rs7Var.f44013c < 0) {
                rs7Var.f44012b = 1;
            }
        }
        return this.f45863c;
    }

    /* renamed from: d */
    public final int m48838d() {
        try {
            return this.f45862b.get() & 255;
        } catch (Exception unused) {
            this.f45863c.f44012b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m48839e() {
        this.f45863c.f44014d.f38807a = m48848n();
        this.f45863c.f44014d.f38808b = m48848n();
        this.f45863c.f44014d.f38809c = m48848n();
        this.f45863c.f44014d.f38810d = m48848n();
        int iM48838d = m48838d();
        boolean z = (iM48838d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM48838d & 7) + 1);
        os7 os7Var = this.f45863c.f44014d;
        os7Var.f38811e = (iM48838d & 64) != 0;
        if (z) {
            os7Var.f38817k = m48841g(iPow);
        } else {
            os7Var.f38817k = null;
        }
        this.f45863c.f44014d.f38816j = this.f45862b.position();
        m48852r();
        if (m48836b()) {
            return;
        }
        rs7 rs7Var = this.f45863c;
        rs7Var.f44013c++;
        rs7Var.f44015e.add(rs7Var.f44014d);
    }

    /* renamed from: f */
    public final void m48840f() {
        int iM48838d = m48838d();
        this.f45864d = iM48838d;
        if (iM48838d <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f45864d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f45862b.get(this.f45861a, i, i2);
                i += i2;
            } catch (Exception unused) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error Reading Block n: ");
                    sb.append(i);
                    sb.append(" count: ");
                    sb.append(i2);
                    sb.append(" blockSize: ");
                    sb.append(this.f45864d);
                }
                this.f45863c.f44012b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    public final int[] m48841g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f45862b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.f45863c.f44012b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    public final void m48842h() {
        m48843i(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: i */
    public final void m48843i(int i) {
        boolean z = false;
        while (!z && !m48836b() && this.f45863c.f44013c <= i) {
            int iM48838d = m48838d();
            if (iM48838d == 33) {
                int iM48838d2 = m48838d();
                if (iM48838d2 == 1) {
                    m48851q();
                } else if (iM48838d2 == 249) {
                    this.f45863c.f44014d = new os7();
                    m48844j();
                } else if (iM48838d2 == 254) {
                    m48851q();
                } else if (iM48838d2 != 255) {
                    m48851q();
                } else {
                    m48840f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f45861a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m48847m();
                    } else {
                        m48851q();
                    }
                }
            } else if (iM48838d == 44) {
                rs7 rs7Var = this.f45863c;
                if (rs7Var.f44014d == null) {
                    rs7Var.f44014d = new os7();
                }
                m48839e();
            } else if (iM48838d != 59) {
                this.f45863c.f44012b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    public final void m48844j() {
        m48838d();
        int iM48838d = m48838d();
        os7 os7Var = this.f45863c.f44014d;
        int i = (iM48838d & 28) >> 2;
        os7Var.f38813g = i;
        if (i == 0) {
            os7Var.f38813g = 1;
        }
        os7Var.f38812f = (iM48838d & 1) != 0;
        int iM48848n = m48848n();
        if (iM48848n < 2) {
            iM48848n = 10;
        }
        os7 os7Var2 = this.f45863c.f44014d;
        os7Var2.f38815i = iM48848n * 10;
        os7Var2.f38814h = m48838d();
        m48838d();
    }

    /* renamed from: k */
    public final void m48845k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m48838d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f45863c.f44012b = 1;
            return;
        }
        m48846l();
        if (!this.f45863c.f44018h || m48836b()) {
            return;
        }
        rs7 rs7Var = this.f45863c;
        rs7Var.f44011a = m48841g(rs7Var.f44019i);
        rs7 rs7Var2 = this.f45863c;
        rs7Var2.f44022l = rs7Var2.f44011a[rs7Var2.f44020j];
    }

    /* renamed from: l */
    public final void m48846l() {
        this.f45863c.f44016f = m48848n();
        this.f45863c.f44017g = m48848n();
        int iM48838d = m48838d();
        rs7 rs7Var = this.f45863c;
        rs7Var.f44018h = (iM48838d & 128) != 0;
        rs7Var.f44019i = (int) Math.pow(2.0d, (iM48838d & 7) + 1);
        this.f45863c.f44020j = m48838d();
        this.f45863c.f44021k = m48838d();
    }

    /* renamed from: m */
    public final void m48847m() {
        do {
            m48840f();
            byte[] bArr = this.f45861a;
            if (bArr[0] == 1) {
                this.f45863c.f44023m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f45864d <= 0) {
                return;
            }
        } while (!m48836b());
    }

    /* renamed from: n */
    public final int m48848n() {
        return this.f45862b.getShort();
    }

    /* renamed from: o */
    public final void m48849o() {
        this.f45862b = null;
        Arrays.fill(this.f45861a, (byte) 0);
        this.f45863c = new rs7();
        this.f45864d = 0;
    }

    /* renamed from: p */
    public ss7 m48850p(ByteBuffer byteBuffer) {
        m48849o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f45862b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f45862b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m48851q() {
        int iM48838d;
        do {
            iM48838d = m48838d();
            this.f45862b.position(Math.min(this.f45862b.position() + iM48838d, this.f45862b.limit()));
        } while (iM48838d > 0);
    }

    /* renamed from: r */
    public final void m48852r() {
        m48838d();
        m48851q();
    }
}
