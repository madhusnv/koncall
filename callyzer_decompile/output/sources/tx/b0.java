package tx;

import ex.InterfaceC2141e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.DispatchException;
import og.od;
import pg.b8;
import pg.n6;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8191a;
import xw.InterfaceC8493a;
import yx.AbstractC8808b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 DEFAULT = new b0("DEFAULT", 0);
    public static final b0 LAZY = new b0("LAZY", 1);
    public static final b0 ATOMIC = new b0("ATOMIC", 2);
    public static final b0 UNDISPATCHED = new b0("UNDISPATCHED", 3);

    private static final /* synthetic */ b0[] $values() {
        return new b0[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        b0[] b0VarArr$values = $values();
        $VALUES = b0VarArr$values;
        $ENTRIES = b8.m11548b(b0VarArr$values);
    }

    private b0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    public final <R, T> void invoke(InterfaceC2141e interfaceC2141e, R r9, InterfaceC7559c<? super T> completion) {
        Object objInvoke;
        int i10 = a0.f34594a[ordinal()];
        qw.a0 a0Var = qw.a0.f30746a;
        if (i10 == 1) {
            try {
                AbstractC8808b.m16250j(a0Var, n6.m11797c(n6.m11795a(interfaceC2141e, r9, completion)));
                return;
            } finally {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).f21165a;
                }
                completion.resumeWith(od.m10796a(th));
            }
        }
        if (i10 == 2) {
            AbstractC4154l.m8923f(interfaceC2141e, "<this>");
            AbstractC4154l.m8923f(completion, "completion");
            n6.m11797c(n6.m11795a(interfaceC2141e, r9, completion)).resumeWith(a0Var);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        AbstractC4154l.m8923f(completion, "completion");
        try {
            InterfaceC7564h context = completion.getContext();
            Object objM16256p = AbstractC8808b.m16256p(context, null);
            try {
                if (interfaceC2141e instanceof AbstractC8191a) {
                    kotlin.jvm.internal.d0.m8907d(2, interfaceC2141e);
                    objInvoke = interfaceC2141e.invoke(r9, completion);
                } else {
                    objInvoke = n6.m11798d(interfaceC2141e, r9, completion);
                }
                AbstractC8808b.m16249i(context, objM16256p);
                if (objInvoke != EnumC7794a.COROUTINE_SUSPENDED) {
                    completion.resumeWith(objInvoke);
                }
            } catch (Throwable th2) {
                AbstractC8808b.m16249i(context, objM16256p);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
