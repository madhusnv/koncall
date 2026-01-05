package rj;

import android.text.TextUtils;
import c9.C0927v;
import com.google.firebase.installations.C1401a;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;
import ji.C3773g;
import sj.C6850b;
import sj.EnumC6852d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rj.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6556b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f31410a;

    /* renamed from: b */
    public final /* synthetic */ C1401a f31411b;

    public /* synthetic */ RunnableC6556b(C1401a c1401a, int i10) {
        this.f31410a = i10;
        this.f31411b = c1401a;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C6850b c6850bM16313D;
        C6850b c6850bM4475g;
        switch (this.f31410a) {
            case 0:
                this.f31411b.m4469a();
                return;
            case 1:
                this.f31411b.m4469a();
                return;
            default:
                C1401a c1401a = this.f31411b;
                Object obj = C1401a.f7144m;
                synchronized (obj) {
                    try {
                        C3773g c3773g = c1401a.f7145a;
                        c3773g.m8293a();
                        C0927v c0927vM2697d = C0927v.m2697d(c3773g.f19662a);
                        try {
                            c6850bM16313D = c1401a.f7147c.m16313D();
                            if (c0927vM2697d != null) {
                                c0927vM2697d.m2706o();
                            }
                        } catch (Throwable th2) {
                            if (c0927vM2697d != null) {
                                c0927vM2697d.m2706o();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    EnumC6852d enumC6852d = c6850bM16313D.f32523b;
                    EnumC6852d enumC6852d2 = EnumC6852d.REGISTER_ERROR;
                    if (enumC6852d == enumC6852d2) {
                        c6850bM4475g = c1401a.m4475g(c6850bM16313D);
                    } else {
                        if (enumC6852d == EnumC6852d.UNREGISTERED) {
                            c6850bM4475g = c1401a.m4475g(c6850bM16313D);
                        } else if (!c1401a.f7148d.m12575a(c6850bM16313D)) {
                            return;
                        } else {
                            c6850bM4475g = c1401a.m4470b(c6850bM16313D);
                        }
                    }
                    synchronized (obj) {
                        try {
                            C3773g c3773g2 = c1401a.f7145a;
                            c3773g2.m8293a();
                            C0927v c0927vM2697d2 = C0927v.m2697d(c3773g2.f19662a);
                            try {
                                c1401a.f7147c.m16323v(c6850bM4475g);
                                if (c0927vM2697d2 != null) {
                                    c0927vM2697d2.m2706o();
                                }
                            } catch (Throwable th3) {
                                if (c0927vM2697d2 != null) {
                                    c0927vM2697d2.m2706o();
                                }
                                throw th3;
                            }
                        } finally {
                        }
                    }
                    synchronized (c1401a) {
                        try {
                            if (c1401a.f7155k.size() != 0 && !TextUtils.equals(c6850bM16313D.f32522a, c6850bM4475g.f32522a)) {
                                Iterator it = c1401a.f7155k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (c6850bM4475g.f32523b == EnumC6852d.REGISTERED) {
                        String str = c6850bM4475g.f32522a;
                        synchronized (c1401a) {
                            c1401a.f7154j = str;
                        }
                    }
                    EnumC6852d enumC6852d3 = c6850bM4475g.f32523b;
                    if (enumC6852d3 == enumC6852d2) {
                        FirebaseInstallationsException.EnumC1400a enumC1400a = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
                        c1401a.m4476h(new FirebaseInstallationsException());
                        return;
                    } else if (enumC6852d3 == EnumC6852d.NOT_GENERATED || enumC6852d3 == EnumC6852d.ATTEMPT_MIGRATION) {
                        c1401a.m4476h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c1401a.m4477i(c6850bM4475g);
                        return;
                    }
                } catch (FirebaseInstallationsException e2) {
                    c1401a.m4476h(e2);
                    return;
                }
        }
    }
}
