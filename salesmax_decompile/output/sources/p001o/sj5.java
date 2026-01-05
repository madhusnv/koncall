package p001o;

import android.util.SparseArray;
import androidx.media3.common.C2181a;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class sj5 implements hyh.InterfaceC14128c {

    /* renamed from: a */
    public final int f45472a;

    /* renamed from: b */
    public final List f45473b;

    public sj5(int i) {
        this(i, nf8.m40499E());
    }

    @Override // p001o.hyh.InterfaceC14128c
    /* renamed from: a */
    public SparseArray mo31292a() {
        return new SparseArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    @Override // p001o.hyh.InterfaceC14128c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hyh mo31293b(int i, hyh.C14127b c14127b) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new l6d(new hnb(c14127b.f27803b, c14127b.m31291a()));
            }
            if (i == 21) {
                return new l6d(new wa8());
            }
            if (i == 27) {
                if (m48372f(4)) {
                    return null;
                }
                return new l6d(new yv7(m48369c(c14127b), m48372f(1), m48372f(8)));
            }
            if (i == 36) {
                return new l6d(new zv7(m48369c(c14127b)));
            }
            if (i == 45) {
                return new l6d(new jnb());
            }
            if (i == 89) {
                return new l6d(new s16(c14127b.f27805d));
            }
            if (i == 172) {
                return new l6d(new ia(c14127b.f27803b, c14127b.m31291a()));
            }
            if (i == 257) {
                return new raf(new mzc("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new l6d(new p06(c14127b.f27803b, c14127b.m31291a(), 5408));
                }
                switch (i) {
                    case 15:
                        if (m48372f(2)) {
                            return null;
                        }
                        return new l6d(new n70(false, c14127b.f27803b, c14127b.m31291a()));
                    case 16:
                        return new l6d(new xv7(m48370d(c14127b)));
                    case 17:
                        if (m48372f(2)) {
                            return null;
                        }
                        return new l6d(new eh9(c14127b.f27803b, c14127b.m31291a()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case Opcodes.LOR /* 129 */:
                                return new l6d(new ea(c14127b.f27803b, c14127b.m31291a()));
                            case 130:
                                if (!m48372f(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case Opcodes.I2F /* 134 */:
                                        if (m48372f(16)) {
                                            return null;
                                        }
                                        return new raf(new mzc("application/x-scte35"));
                                    case Opcodes.I2D /* 135 */:
                                        break;
                                    case Opcodes.L2I /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new l6d(new p06(c14127b.f27803b, c14127b.m31291a(), 4096));
        }
        return new l6d(new wv7(m48370d(c14127b)));
    }

    /* renamed from: c */
    public final nbf m48369c(hyh.C14127b c14127b) {
        return new nbf(m48371e(c14127b));
    }

    /* renamed from: d */
    public final adi m48370d(hyh.C14127b c14127b) {
        return new adi(m48371e(c14127b));
    }

    /* renamed from: e */
    public final List m48371e(hyh.C14127b c14127b) {
        String str;
        int i;
        if (m48372f(32)) {
            return this.f45473b;
        }
        zwc zwcVar = new zwc(c14127b.f27806e);
        List arrayList = this.f45473b;
        while (zwcVar.m60020a() > 0) {
            int iM60004H = zwcVar.m60004H();
            int iM60025f = zwcVar.m60025f() + zwcVar.m60004H();
            if (iM60004H == 134) {
                arrayList = new ArrayList();
                int iM60004H2 = zwcVar.m60004H() & 31;
                for (int i2 = 0; i2 < iM60004H2; i2++) {
                    String strM60001E = zwcVar.m60001E(3);
                    int iM60004H3 = zwcVar.m60004H();
                    boolean z = (iM60004H3 & 128) != 0;
                    if (z) {
                        i = iM60004H3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM60004H = (byte) zwcVar.m60004H();
                    zwcVar.m60018V(1);
                    arrayList.add(new C2181a.b().o0(str).e0(strM60001E).m6749L(i).b0(z ? hf3.m30319b((bM60004H & 64) != 0) : null).m6748K());
                }
            }
            zwcVar.m60017U(iM60025f);
        }
        return arrayList;
    }

    /* renamed from: f */
    public final boolean m48372f(int i) {
        return (i & this.f45472a) != 0;
    }

    public sj5(int i, List list) {
        this.f45472a = i;
        this.f45473b = list;
    }
}
