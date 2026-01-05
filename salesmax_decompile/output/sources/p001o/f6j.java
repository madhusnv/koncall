package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import org.objectweb.asm.Opcodes;
import p001o.rl1;

/* loaded from: classes6.dex */
public final class f6j implements Closeable {

    /* renamed from: H */
    public final rl1 f22819H;

    /* renamed from: L */
    public mcb f22820L;

    /* renamed from: M */
    public final byte[] f22821M;

    /* renamed from: Q */
    public final rl1.C16621b f22822Q;

    /* renamed from: a */
    public final boolean f22823a;

    /* renamed from: b */
    public final im1 f22824b;

    /* renamed from: c */
    public final InterfaceC13351a f22825c;

    /* renamed from: d */
    public final boolean f22826d;

    /* renamed from: e */
    public final boolean f22827e;

    /* renamed from: f */
    public boolean f22828f;

    /* renamed from: g */
    public int f22829g;

    /* renamed from: h */
    public long f22830h;

    /* renamed from: q */
    public boolean f22831q;

    /* renamed from: s */
    public boolean f22832s;

    /* renamed from: x */
    public boolean f22833x;

    /* renamed from: y */
    public final rl1 f22834y;

    /* renamed from: o.f6j$a */
    public interface InterfaceC13351a {
        /* renamed from: a */
        void mo22918a(zq1 zq1Var);

        /* renamed from: c */
        void mo22919c(String str);

        /* renamed from: d */
        void mo22920d(zq1 zq1Var);

        /* renamed from: g */
        void mo22921g(zq1 zq1Var);

        /* renamed from: h */
        void mo22922h(int i, String str);
    }

    public f6j(boolean z, im1 im1Var, InterfaceC13351a interfaceC13351a, boolean z2, boolean z3) {
        sq8.m48649h(im1Var, "source");
        sq8.m48649h(interfaceC13351a, "frameCallback");
        this.f22823a = z;
        this.f22824b = im1Var;
        this.f22825c = interfaceC13351a;
        this.f22826d = z2;
        this.f22827e = z3;
        this.f22834y = new rl1();
        this.f22819H = new rl1();
        this.f22821M = z ? null : new byte[4];
        this.f22822Q = z ? null : new rl1.C16621b();
    }

    /* renamed from: a */
    public final void m26217a() throws DataFormatException, IOException {
        m26219d();
        if (this.f22832s) {
            m26218c();
        } else {
            m26221g();
        }
    }

    /* renamed from: c */
    public final void m26218c() throws ProtocolException, EOFException {
        short s;
        String strM46909T;
        long j = this.f22830h;
        if (j > 0) {
            this.f22824b.mo32307N(this.f22834y, j);
            if (!this.f22823a) {
                rl1 rl1Var = this.f22834y;
                rl1.C16621b c16621b = this.f22822Q;
                sq8.m48646e(c16621b);
                rl1Var.m46905J(c16621b);
                this.f22822Q.m46924f(0L);
                e6j e6jVar = e6j.f21070a;
                rl1.C16621b c16621b2 = this.f22822Q;
                byte[] bArr = this.f22821M;
                sq8.m48646e(bArr);
                e6jVar.m24422b(c16621b2, bArr);
                this.f22822Q.close();
            }
        }
        switch (this.f22829g) {
            case 8:
                long jF0 = this.f22834y.f0();
                if (jF0 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jF0 != 0) {
                    s = this.f22834y.readShort();
                    strM46909T = this.f22834y.m46909T();
                    String strM24421a = e6j.f21070a.m24421a(s);
                    if (strM24421a != null) {
                        throw new ProtocolException(strM24421a);
                    }
                } else {
                    s = 1005;
                    strM46909T = "";
                }
                this.f22825c.mo22922h(s, strM46909T);
                this.f22828f = true;
                return;
            case 9:
                this.f22825c.mo22920d(this.f22834y.m46906O());
                return;
            case 10:
                this.f22825c.mo22918a(this.f22834y.m46906O());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + jgj.m33825s(this.f22829g));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mcb mcbVar = this.f22820L;
        if (mcbVar != null) {
            mcbVar.close();
        }
    }

    /* renamed from: d */
    public final void m26219d() throws IOException {
        boolean z;
        if (this.f22828f) {
            throw new IOException("closed");
        }
        long jMo40797h = this.f22824b.timeout().mo40797h();
        this.f22824b.timeout().mo40791b();
        try {
            int iM28622b = ggj.m28622b(this.f22824b.readByte(), Constants.MAX_HOST_LENGTH);
            this.f22824b.timeout().mo40796g(jMo40797h, TimeUnit.NANOSECONDS);
            int i = iM28622b & 15;
            this.f22829g = i;
            boolean z2 = (iM28622b & 128) != 0;
            this.f22831q = z2;
            boolean z3 = (iM28622b & 8) != 0;
            this.f22832s = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (iM28622b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f22826d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f22833x = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iM28622b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iM28622b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iM28622b2 = ggj.m28622b(this.f22824b.readByte(), Constants.MAX_HOST_LENGTH);
            boolean z5 = (iM28622b2 & 128) != 0;
            if (z5 == this.f22823a) {
                throw new ProtocolException(this.f22823a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = iM28622b2 & Opcodes.LAND;
            this.f22830h = j;
            if (j == 126) {
                this.f22830h = ggj.m28623c(this.f22824b.readShort(), 65535);
            } else if (j == 127) {
                long j2 = this.f22824b.readLong();
                this.f22830h = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + jgj.m33826t(this.f22830h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f22832s && this.f22830h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                im1 im1Var = this.f22824b;
                byte[] bArr = this.f22821M;
                sq8.m48646e(bArr);
                im1Var.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f22824b.timeout().mo40796g(jMo40797h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    /* renamed from: f */
    public final void m26220f() throws IOException {
        while (!this.f22828f) {
            long j = this.f22830h;
            if (j > 0) {
                this.f22824b.mo32307N(this.f22819H, j);
                if (!this.f22823a) {
                    rl1 rl1Var = this.f22819H;
                    rl1.C16621b c16621b = this.f22822Q;
                    sq8.m48646e(c16621b);
                    rl1Var.m46905J(c16621b);
                    this.f22822Q.m46924f(this.f22819H.f0() - this.f22830h);
                    e6j e6jVar = e6j.f21070a;
                    rl1.C16621b c16621b2 = this.f22822Q;
                    byte[] bArr = this.f22821M;
                    sq8.m48646e(bArr);
                    e6jVar.m24422b(c16621b2, bArr);
                    this.f22822Q.close();
                }
            }
            if (this.f22831q) {
                return;
            }
            m26222h();
            if (this.f22829g != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + jgj.m33825s(this.f22829g));
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: g */
    public final void m26221g() throws DataFormatException, IOException {
        int i = this.f22829g;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + jgj.m33825s(i));
        }
        m26220f();
        if (this.f22833x) {
            mcb mcbVar = this.f22820L;
            if (mcbVar == null) {
                mcbVar = new mcb(this.f22827e);
                this.f22820L = mcbVar;
            }
            mcbVar.m38742a(this.f22819H);
        }
        if (i == 1) {
            this.f22825c.mo22919c(this.f22819H.m46909T());
        } else {
            this.f22825c.mo22921g(this.f22819H.m46906O());
        }
    }

    /* renamed from: h */
    public final void m26222h() throws IOException {
        while (!this.f22828f) {
            m26219d();
            if (!this.f22832s) {
                return;
            } else {
                m26218c();
            }
        }
    }
}
