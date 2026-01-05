package r6;

import androidx.datastore.preferences.protobuf.AbstractC0307b;
import androidx.datastore.preferences.protobuf.AbstractC0332w;
import androidx.datastore.preferences.protobuf.AbstractC0335z;
import androidx.datastore.preferences.protobuf.C0312g;
import androidx.datastore.preferences.protobuf.C0333x;
import androidx.datastore.preferences.protobuf.EnumC0334y;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r6.g */
/* loaded from: classes.dex */
public final class C6478g extends AbstractC0335z {
    private static final C6478g DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private a0 strings_ = y0.f2427d;

    static {
        C6478g c6478g = new C6478g();
        DEFAULT_INSTANCE = c6478g;
        AbstractC0335z.m1079j(C6478g.class, c6478g);
    }

    /* renamed from: l */
    public static void m12460l(C6478g c6478g, Iterable iterable) {
        a0 a0Var = c6478g.strings_;
        if (!((AbstractC0307b) a0Var).f2292a) {
            y0 y0Var = (y0) a0Var;
            int i10 = y0Var.f2429c;
            c6478g.strings_ = y0Var.m1075c(i10 == 0 ? 10 : i10 * 2);
        }
        RandomAccess randomAccess = c6478g.strings_;
        Charset charset = b0.f2293a;
        if (iterable instanceof d0) {
            List listM861d = ((d0) iterable).m861d();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((y0) randomAccess).getClass();
            Iterator it = listM861d.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C0312g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C0312g.m870c(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof v0) {
            ((AbstractC0307b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((y0) randomAccess).f2429c);
        }
        y0 y0Var2 = (y0) randomAccess;
        int i11 = y0Var2.f2429c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (y0Var2.f2429c - i11) + " is null.";
                for (int i12 = y0Var2.f2429c - 1; i12 >= i11; i12--) {
                    y0Var2.remove(i12);
                }
                throw new NullPointerException(str);
            }
            y0Var2.add(obj);
        }
    }

    /* renamed from: m */
    public static C6478g m12461m() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: o */
    public static C6477f m12462o() {
        C6478g c6478g = DEFAULT_INSTANCE;
        c6478g.getClass();
        return (C6477f) ((AbstractC0332w) c6478g.mo1080c(EnumC0334y.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0335z
    /* renamed from: c */
    public final Object mo1080c(EnumC0334y enumC0334y) {
        u0 c0333x;
        switch (AbstractC6473b.f31143a[enumC0334y.ordinal()]) {
            case 1:
                return new C6478g();
            case 2:
                return new C6477f(DEFAULT_INSTANCE);
            case 3:
                return new z0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (C6478g.class) {
                    try {
                        c0333x = PARSER;
                        if (c0333x == null) {
                            c0333x = new C0333x();
                            PARSER = c0333x;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return c0333x;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public final a0 m12463n() {
        return this.strings_;
    }
}
