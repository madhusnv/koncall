package p001o;

import java.io.IOException;
import p001o.rcb;
import p001o.yq1;

/* loaded from: classes4.dex */
public abstract class q8 implements rcb {
    protected int memoizedHashCode = 0;

    /* renamed from: o.q8$a */
    public static abstract class AbstractC16319a implements rcb.InterfaceC16588a {
        /* renamed from: h */
        public static v3i m44947h(rcb rcbVar) {
            return new v3i(rcbVar);
        }

        /* renamed from: f */
        public abstract AbstractC16319a mo44948f(q8 q8Var);

        @Override // p001o.rcb.InterfaceC16588a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC16319a z1(rcb rcbVar) {
            if (getDefaultInstanceForType().getClass().isInstance(rcbVar)) {
                return mo44948f((q8) rcbVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Override // p001o.rcb
    /* renamed from: a */
    public byte[] mo44940a() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            mf3 mf3VarM38887U = mf3.m38887U(bArr);
            mo46523c(mf3VarM38887U);
            mf3VarM38887U.m38919c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m44944f("byte array"), e);
        }
    }

    @Override // p001o.rcb
    /* renamed from: b */
    public yq1 mo44941b() {
        try {
            yq1.C18459h c18459hM58083x = yq1.m58083x(getSerializedSize());
            mo46523c(c18459hM58083x.m58105b());
            return c18459hM58083x.m58104a();
        } catch (IOException e) {
            throw new RuntimeException(m44944f("ByteString"), e);
        }
    }

    /* renamed from: d */
    abstract int mo44942d();

    /* renamed from: e */
    public int m44943e(o5f o5fVar) {
        int iMo44942d = mo44942d();
        if (iMo44942d != -1) {
            return iMo44942d;
        }
        int iMo16907d = o5fVar.mo16907d(this);
        mo44946h(iMo16907d);
        return iMo16907d;
    }

    /* renamed from: f */
    public final String m44944f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: g */
    public v3i m44945g() {
        return new v3i(this);
    }

    /* renamed from: h */
    abstract void mo44946h(int i);
}
