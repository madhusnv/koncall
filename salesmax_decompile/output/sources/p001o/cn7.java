package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p001o.gf8;

/* loaded from: classes3.dex */
public abstract class cn7 extends uv7 {
    /* renamed from: a */
    public static Object m21443a(Future future) {
        dgd.m23072y(future.isDone(), "Future was expected to be done: %s", future);
        return x3i.m55622a(future);
    }

    /* renamed from: b */
    public static zfa m21444b(Throwable th) {
        dgd.m23062o(th);
        return new gf8.C13702a(th);
    }

    /* renamed from: c */
    public static zfa m21445c(Object obj) {
        return obj == null ? gf8.f25070b : new gf8(obj);
    }

    /* renamed from: d */
    public static zfa m21446d(zfa zfaVar, ol7 ol7Var, Executor executor) {
        return z9.m58946F(zfaVar, ol7Var, executor);
    }
}
