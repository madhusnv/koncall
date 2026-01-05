package d7;

import java.util.concurrent.Executor;
import k0.ExecutorC3900j;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.C7611u;
import p020v.RunnableC7606p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8142a;

    /* renamed from: b */
    public boolean f8143b;

    /* renamed from: c */
    public final Object f8144c;

    /* renamed from: d */
    public final Object f8145d;

    public v0(C1651w registry, EnumC1644p event) {
        this.f8142a = 0;
        AbstractC4154l.m8923f(registry, "registry");
        AbstractC4154l.m8923f(event, "event");
        this.f8144c = registry;
        this.f8145d = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8142a) {
            case 0:
                if (!this.f8143b) {
                    ((C1651w) this.f8144c).m5355g((EnumC1644p) this.f8145d);
                    this.f8143b = true;
                    break;
                }
                break;
            default:
                ((Executor) this.f8144c).execute(new RunnableC7606p(1, this));
                break;
        }
    }

    public v0(C7611u c7611u, ExecutorC3900j executorC3900j) {
        this.f8142a = 1;
        this.f8145d = c7611u;
        this.f8143b = false;
        this.f8144c = executorC3900j;
    }
}
