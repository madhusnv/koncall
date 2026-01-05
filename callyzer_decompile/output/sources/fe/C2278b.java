package fe;

import android.graphics.Bitmap;
import b00.c0;
import b00.d0;
import com.amplifyframework.storage.ObjectMetadata;
import eb.i3;
import ex.InterfaceC2137a;
import iz.C3370c;
import iz.C3389v;
import iz.C3393z;
import iz.k0;
import java.io.EOFException;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.C5176n;
import og.nd;
import pg.a7;
import pg.h7;
import qw.EnumC6359i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fe.b */
/* loaded from: classes.dex */
public final class C2278b {

    /* renamed from: a */
    public final Object f10296a;

    /* renamed from: b */
    public final Object f10297b;

    /* renamed from: c */
    public final long f10298c;

    /* renamed from: d */
    public final long f10299d;

    /* renamed from: e */
    public final boolean f10300e;

    /* renamed from: f */
    public final C3389v f10301f;

    public C2278b(d0 d0Var) throws NumberFormatException, EOFException {
        EnumC6359i enumC6359i = EnumC6359i.NONE;
        final int i10 = 0;
        this.f10296a = nd.m10781b(enumC6359i, new InterfaceC2137a(this) { // from class: fe.a

            /* renamed from: b */
            public final /* synthetic */ C2278b f10295b;

            {
                this.f10295b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                int i11 = i10;
                C2278b c2278b = this.f10295b;
                switch (i11) {
                    case 0:
                        C3370c c3370c = C3370c.f17794n;
                        return a7.m11535a(c2278b.f10301f);
                    default:
                        String strM7787b = c2278b.f10301f.m7787b(ObjectMetadata.CONTENT_TYPE);
                        if (strM7787b == null) {
                            return null;
                        }
                        C5176n c5176n = C3393z.f18000e;
                        try {
                            return h7.m11676d(strM7787b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final char c2 = 1 == true ? 1 : 0;
        this.f10297b = nd.m10781b(enumC6359i, new InterfaceC2137a(this) { // from class: fe.a

            /* renamed from: b */
            public final /* synthetic */ C2278b f10295b;

            {
                this.f10295b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                int i11 = c2;
                C2278b c2278b = this.f10295b;
                switch (i11) {
                    case 0:
                        C3370c c3370c = C3370c.f17794n;
                        return a7.m11535a(c2278b.f10301f);
                    default:
                        String strM7787b = c2278b.f10301f.m7787b(ObjectMetadata.CONTENT_TYPE);
                        if (strM7787b == null) {
                            return null;
                        }
                        C5176n c5176n = C3393z.f18000e;
                        try {
                            return h7.m11676d(strM7787b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f10298c = Long.parseLong(d0Var.mo1541C(Long.MAX_VALUE));
        this.f10299d = Long.parseLong(d0Var.mo1541C(Long.MAX_VALUE));
        this.f10300e = Integer.parseInt(d0Var.mo1541C(Long.MAX_VALUE)) > 0;
        int i11 = Integer.parseInt(d0Var.mo1541C(Long.MAX_VALUE));
        i3 i3Var = new i3(2);
        for (int i12 = 0; i12 < i11; i12++) {
            String strMo1541C = d0Var.mo1541C(Long.MAX_VALUE);
            Bitmap.Config[] configArr = AbstractC4066g.f20920a;
            int iM10098I = AbstractC5178p.m10098I(strMo1541C, ':', 0, 6);
            if (iM10098I == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strMo1541C).toString());
            }
            String strSubstring = strMo1541C.substring(0, iM10098I);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            String string = AbstractC5178p.g0(strSubstring).toString();
            String strSubstring2 = strMo1541C.substring(iM10098I + 1);
            AbstractC4154l.m8922e(strSubstring2, "substring(...)");
            i3Var.m5726d(string, strSubstring2);
        }
        this.f10301f = i3Var.m5727e();
    }

    /* renamed from: a */
    public final void m5963a(c0 c0Var) {
        c0Var.m1540j(this.f10298c);
        c0Var.writeByte(10);
        c0Var.m1540j(this.f10299d);
        c0Var.writeByte(10);
        c0Var.m1540j(this.f10300e ? 1L : 0L);
        c0Var.writeByte(10);
        C3389v c3389v = this.f10301f;
        c0Var.m1540j(c3389v.size());
        c0Var.writeByte(10);
        int size = c3389v.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0Var.mo1534N(c3389v.m7788h(i10));
            c0Var.mo1534N(": ");
            c0Var.mo1534N(c3389v.m7790q(i10));
            c0Var.writeByte(10);
        }
    }

    public C2278b(k0 k0Var) {
        EnumC6359i enumC6359i = EnumC6359i.NONE;
        final int i10 = 0;
        this.f10296a = nd.m10781b(enumC6359i, new InterfaceC2137a(this) { // from class: fe.a

            /* renamed from: b */
            public final /* synthetic */ C2278b f10295b;

            {
                this.f10295b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                int i11 = i10;
                C2278b c2278b = this.f10295b;
                switch (i11) {
                    case 0:
                        C3370c c3370c = C3370c.f17794n;
                        return a7.m11535a(c2278b.f10301f);
                    default:
                        String strM7787b = c2278b.f10301f.m7787b(ObjectMetadata.CONTENT_TYPE);
                        if (strM7787b == null) {
                            return null;
                        }
                        C5176n c5176n = C3393z.f18000e;
                        try {
                            return h7.m11676d(strM7787b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final int i11 = 1;
        this.f10297b = nd.m10781b(enumC6359i, new InterfaceC2137a(this) { // from class: fe.a

            /* renamed from: b */
            public final /* synthetic */ C2278b f10295b;

            {
                this.f10295b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                int i112 = i11;
                C2278b c2278b = this.f10295b;
                switch (i112) {
                    case 0:
                        C3370c c3370c = C3370c.f17794n;
                        return a7.m11535a(c2278b.f10301f);
                    default:
                        String strM7787b = c2278b.f10301f.m7787b(ObjectMetadata.CONTENT_TYPE);
                        if (strM7787b == null) {
                            return null;
                        }
                        C5176n c5176n = C3393z.f18000e;
                        try {
                            return h7.m11676d(strM7787b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f10298c = k0Var.f17927l;
        this.f10299d = k0Var.f17928m;
        this.f10300e = k0Var.f17921e != null;
        this.f10301f = k0Var.f17922f;
    }
}
