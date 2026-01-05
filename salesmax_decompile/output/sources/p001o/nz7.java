package p001o;

import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.services.model.ActivityMetrices;
import ai.salesmax.services.model.ActivityMetrics;
import androidx.lifecycle.AbstractC2145n;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class nz7 {

    /* renamed from: a */
    public ActivityMetrices f37470a;

    /* renamed from: b */
    public hpb f37471b;

    /* renamed from: c */
    public Function f37472c;

    /* renamed from: d */
    public x6c f37473d;

    /* renamed from: e */
    public su5 f37474e;

    public nz7(ActivityMetrices activityMetrices, Function function, x6c x6cVar) {
        this.f37470a = activityMetrices;
        this.f37472c = function;
        this.f37473d = x6cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m41303j(HomeTasksStatus homeTasksStatus) {
        this.f37471b.setValue(homeTasksStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m41304k() {
        final HomeTasksStatus homeTasksStatus = (HomeTasksStatus) this.f37472c.apply(this.f37470a);
        j0f.m33008i(new Runnable() { // from class: o.lz7
            @Override // java.lang.Runnable
            public final void run() {
                this.f34559a.m41303j(homeTasksStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m41305l(ActivityMetrics activityMetrics) {
        this.f37470a.addActivityMetrics(activityMetrics);
        new Thread(new Runnable() { // from class: o.kz7
            @Override // java.lang.Runnable
            public final void run() {
                this.f32872a.m41304k();
            }
        }).start();
    }

    /* renamed from: m */
    public static /* synthetic */ void m41306m(Throwable th) {
    }

    /* renamed from: n */
    public static /* synthetic */ void m41307n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m41308o(boolean z, HomeTasksStatus homeTasksStatus, HomeTasksStatus homeTasksStatus2) {
        homeTasksStatus2.setShowUniqueCalls(z);
        this.f37471b.setValue(homeTasksStatus);
    }

    /* renamed from: g */
    public void m41309g() {
        Optional.ofNullable(this.f37474e).ifPresent(new dpd());
        this.f37474e = null;
        this.f37471b = null;
    }

    /* renamed from: h */
    public final AbstractC2145n m41310h() {
        Optional.ofNullable(this.f37474e).ifPresent(new dpd());
        hpb hpbVar = new hpb();
        this.f37471b = hpbVar;
        hpbVar.setValue((HomeTasksStatus) this.f37472c.apply(this.f37470a));
        this.f37474e = this.f37473d.w0(new gu3() { // from class: o.hz7
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f27821a.m41305l((ActivityMetrics) obj);
            }
        }, new gu3() { // from class: o.iz7
            @Override // p001o.gu3
            public final void accept(Object obj) {
                nz7.m41306m((Throwable) obj);
            }
        }, new jm() { // from class: o.jz7
            @Override // p001o.jm
            public final void run() {
                nz7.m41307n();
            }
        });
        return this.f37471b;
    }

    /* renamed from: i */
    public AbstractC2145n m41311i() {
        if (this.f37471b == null) {
            m41310h();
        }
        return this.f37471b;
    }

    /* renamed from: p */
    public void m41312p(final boolean z) {
        final HomeTasksStatus homeTasksStatus = (HomeTasksStatus) this.f37471b.getValue();
        Optional.ofNullable(homeTasksStatus).ifPresent(new Consumer() { // from class: o.mz7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f36129a.m41308o(z, homeTasksStatus, (HomeTasksStatus) obj);
            }
        });
    }
}
