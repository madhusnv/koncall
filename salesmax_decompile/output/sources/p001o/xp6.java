package p001o;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class xp6 implements u8j {

    /* renamed from: a */
    public final WindowLayoutComponent f54018a;

    /* renamed from: b */
    public final ReentrantLock f54019b;

    /* renamed from: c */
    public final Map f54020c;

    /* renamed from: d */
    public final Map f54021d;

    /* renamed from: o.xp6$a */
    public static final class C18207a implements Consumer {

        /* renamed from: a */
        public final Activity f54022a;

        /* renamed from: b */
        public final ReentrantLock f54023b;

        /* renamed from: c */
        public taj f54024c;

        /* renamed from: d */
        public final Set f54025d;

        public C18207a(Activity activity) {
            sq8.m48649h(activity, "activity");
            this.f54022a = activity;
            this.f54023b = new ReentrantLock();
            this.f54025d = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            sq8.m48649h(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f54023b;
            reentrantLock.lock();
            try {
                this.f54024c = cq6.f18499a.m21583b(this.f54022a, windowLayoutInfo);
                Iterator it = this.f54025d.iterator();
                while (it.hasNext()) {
                    ((hu3) it.next()).accept(this.f54024c);
                }
                y3i y3iVar = y3i.f54824a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final void m56559b(hu3 hu3Var) {
            sq8.m48649h(hu3Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.f54023b;
            reentrantLock.lock();
            try {
                taj tajVar = this.f54024c;
                if (tajVar != null) {
                    hu3Var.accept(tajVar);
                }
                this.f54025d.add(hu3Var);
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: c */
        public final boolean m56560c() {
            return this.f54025d.isEmpty();
        }

        /* renamed from: d */
        public final void m56561d(hu3 hu3Var) {
            sq8.m48649h(hu3Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.f54023b;
            reentrantLock.lock();
            try {
                this.f54025d.remove(hu3Var);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public xp6(WindowLayoutComponent windowLayoutComponent) {
        sq8.m48649h(windowLayoutComponent, "component");
        this.f54018a = windowLayoutComponent;
        this.f54019b = new ReentrantLock();
        this.f54020c = new LinkedHashMap();
        this.f54021d = new LinkedHashMap();
    }

    @Override // p001o.u8j
    /* renamed from: a */
    public void mo34398a(Activity activity, Executor executor, hu3 hu3Var) {
        y3i y3iVar;
        sq8.m48649h(activity, "activity");
        sq8.m48649h(executor, "executor");
        sq8.m48649h(hu3Var, "callback");
        ReentrantLock reentrantLock = this.f54019b;
        reentrantLock.lock();
        try {
            C18207a c18207a = (C18207a) this.f54020c.get(activity);
            if (c18207a == null) {
                y3iVar = null;
            } else {
                c18207a.m56559b(hu3Var);
                this.f54021d.put(hu3Var, activity);
                y3iVar = y3i.f54824a;
            }
            if (y3iVar == null) {
                C18207a c18207a2 = new C18207a(activity);
                this.f54020c.put(activity, c18207a2);
                this.f54021d.put(hu3Var, activity);
                c18207a2.m56559b(hu3Var);
                this.f54018a.addWindowLayoutInfoListener(activity, c18207a2);
            }
            y3i y3iVar2 = y3i.f54824a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p001o.u8j
    /* renamed from: b */
    public void mo34399b(hu3 hu3Var) {
        sq8.m48649h(hu3Var, "callback");
        ReentrantLock reentrantLock = this.f54019b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f54021d.get(hu3Var);
            if (activity == null) {
                return;
            }
            C18207a c18207a = (C18207a) this.f54020c.get(activity);
            if (c18207a == null) {
                return;
            }
            c18207a.m56561d(hu3Var);
            if (c18207a.m56560c()) {
                this.f54018a.removeWindowLayoutInfoListener(c18207a);
            }
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
