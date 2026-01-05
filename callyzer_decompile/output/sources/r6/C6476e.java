package r6;

import androidx.datastore.preferences.protobuf.AbstractC0332w;
import androidx.datastore.preferences.protobuf.AbstractC0335z;
import androidx.datastore.preferences.protobuf.C0314i;
import androidx.datastore.preferences.protobuf.C0317l;
import androidx.datastore.preferences.protobuf.C0320o;
import androidx.datastore.preferences.protobuf.C0333x;
import androidx.datastore.preferences.protobuf.EnumC0334y;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r6.e */
/* loaded from: classes.dex */
public final class C6476e extends AbstractC0335z {
    private static final C6476e DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private l0 preferences_ = l0.f2366b;

    static {
        C6476e c6476e = new C6476e();
        DEFAULT_INSTANCE = c6476e;
        AbstractC0335z.m1079j(C6476e.class, c6476e);
    }

    /* renamed from: l */
    public static l0 m12456l(C6476e c6476e) {
        l0 l0Var = c6476e.preferences_;
        if (!l0Var.f2367a) {
            c6476e.preferences_ = l0Var.m963d();
        }
        return c6476e.preferences_;
    }

    /* renamed from: n */
    public static C6474c m12457n() {
        C6476e c6476e = DEFAULT_INSTANCE;
        c6476e.getClass();
        return (C6474c) ((AbstractC0332w) c6476e.mo1080c(EnumC0334y.NEW_BUILDER));
    }

    /* renamed from: o */
    public static C6476e m12458o(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        C6476e c6476e = DEFAULT_INSTANCE;
        C0314i c0314i = new C0314i(fileInputStream);
        C0320o c0320oM1022a = C0320o.m1022a();
        AbstractC0335z abstractC0335zM1083i = c6476e.m1083i();
        try {
            x0 x0Var = x0.f2424c;
            x0Var.getClass();
            a1 a1VarM1073a = x0Var.m1073a(abstractC0335zM1083i.getClass());
            C0317l c0317l = (C0317l) c0314i.f2355b;
            if (c0317l == null) {
                c0317l = new C0317l(c0314i);
            }
            a1VarM1073a.mo818i(abstractC0335zM1083i, c0317l, c0320oM1022a);
            a1VarM1073a.mo810a(abstractC0335zM1083i);
            if (AbstractC0335z.m1078f(abstractC0335zM1083i, true)) {
                return (C6476e) abstractC0335zM1083i;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e2) {
            if (e2.f2291a) {
                throw new InvalidProtocolBufferException(e2.getMessage(), e2);
            }
            throw e2;
        } catch (UninitializedMessageException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw new InvalidProtocolBufferException(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw e12;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0335z
    /* renamed from: c */
    public final Object mo1080c(EnumC0334y enumC0334y) {
        u0 c0333x;
        switch (AbstractC6473b.f31143a[enumC0334y.ordinal()]) {
            case 1:
                return new C6476e();
            case 2:
                return new C6474c(DEFAULT_INSTANCE);
            case 3:
                return new z0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC6475d.f31144a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (C6476e.class) {
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

    /* renamed from: m */
    public final Map m12459m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
