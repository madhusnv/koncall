package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import p001o.fgd;
import p001o.nzh;
import p001o.odb;
import p001o.pdb;
import p001o.zsh;

/* renamed from: androidx.emoji2.text.f */
/* loaded from: classes2.dex */
public final class C2069f {

    /* renamed from: a */
    public final odb f7320a;

    /* renamed from: b */
    public final char[] f7321b;

    /* renamed from: c */
    public final a f7322c = new a(1024);

    /* renamed from: d */
    public final Typeface f7323d;

    /* renamed from: androidx.emoji2.text.f$a */
    public static class a {

        /* renamed from: a */
        public final SparseArray f7324a;

        /* renamed from: b */
        public nzh f7325b;

        public a() {
            this(1);
        }

        /* renamed from: a */
        public a m6130a(int i) {
            SparseArray sparseArray = this.f7324a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i);
        }

        /* renamed from: b */
        public final nzh m6131b() {
            return this.f7325b;
        }

        /* renamed from: c */
        public void m6132c(nzh nzhVar, int i, int i2) {
            a aVarM6130a = m6130a(nzhVar.m41326b(i));
            if (aVarM6130a == null) {
                aVarM6130a = new a();
                this.f7324a.put(nzhVar.m41326b(i), aVarM6130a);
            }
            if (i2 > i) {
                aVarM6130a.m6132c(nzhVar, i + 1, i2);
            } else {
                aVarM6130a.f7325b = nzhVar;
            }
        }

        public a(int i) {
            this.f7324a = new SparseArray(i);
        }
    }

    public C2069f(Typeface typeface, odb odbVar) {
        this.f7323d = typeface;
        this.f7320a = odbVar;
        this.f7321b = new char[odbVar.m42084k() * 2];
        m6123a(odbVar);
    }

    /* renamed from: b */
    public static C2069f m6122b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            zsh.m59821a("EmojiCompat.MetadataRepo.create");
            return new C2069f(typeface, pdb.m43487b(byteBuffer));
        } finally {
            zsh.m59822b();
        }
    }

    /* renamed from: a */
    public final void m6123a(odb odbVar) {
        int iM42084k = odbVar.m42084k();
        for (int i = 0; i < iM42084k; i++) {
            nzh nzhVar = new nzh(this, i);
            Character.toChars(nzhVar.m41330f(), this.f7321b, i * 2);
            m6129h(nzhVar);
        }
    }

    /* renamed from: c */
    public char[] m6124c() {
        return this.f7321b;
    }

    /* renamed from: d */
    public odb m6125d() {
        return this.f7320a;
    }

    /* renamed from: e */
    public int m6126e() {
        return this.f7320a.m42085l();
    }

    /* renamed from: f */
    public a m6127f() {
        return this.f7322c;
    }

    /* renamed from: g */
    public Typeface m6128g() {
        return this.f7323d;
    }

    /* renamed from: h */
    public void m6129h(nzh nzhVar) {
        fgd.m26664h(nzhVar, "emoji metadata cannot be null");
        fgd.m26658b(nzhVar.m41327c() > 0, "invalid metadata codepoint length");
        this.f7322c.m6132c(nzhVar, 0, nzhVar.m41327c() - 1);
    }
}
