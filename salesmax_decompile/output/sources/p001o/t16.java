package p001o;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import p001o.fh0;

/* loaded from: classes2.dex */
public abstract class t16 implements fh0.InterfaceC13428b {

    /* renamed from: m */
    public static final AbstractC16977s f46201m = new C16965g("translationX");

    /* renamed from: n */
    public static final AbstractC16977s f46202n = new C16966h("translationY");

    /* renamed from: o */
    public static final AbstractC16977s f46203o = new C16967i("translationZ");

    /* renamed from: p */
    public static final AbstractC16977s f46204p = new C16968j("scaleX");

    /* renamed from: q */
    public static final AbstractC16977s f46205q = new C16969k("scaleY");

    /* renamed from: r */
    public static final AbstractC16977s f46206r = new C16970l("rotation");

    /* renamed from: s */
    public static final AbstractC16977s f46207s = new C16971m("rotationX");

    /* renamed from: t */
    public static final AbstractC16977s f46208t = new C16972n("rotationY");

    /* renamed from: u */
    public static final AbstractC16977s f46209u = new C16973o("x");

    /* renamed from: v */
    public static final AbstractC16977s f46210v = new C16959a("y");

    /* renamed from: w */
    public static final AbstractC16977s f46211w = new C16960b("z");

    /* renamed from: x */
    public static final AbstractC16977s f46212x = new C16961c("alpha");

    /* renamed from: y */
    public static final AbstractC16977s f46213y = new C16962d("scrollX");

    /* renamed from: z */
    public static final AbstractC16977s f46214z = new C16963e("scrollY");

    /* renamed from: a */
    public float f46215a;

    /* renamed from: b */
    public float f46216b;

    /* renamed from: c */
    public boolean f46217c;

    /* renamed from: d */
    public final Object f46218d;

    /* renamed from: e */
    public final l37 f46219e;

    /* renamed from: f */
    public boolean f46220f;

    /* renamed from: g */
    public float f46221g;

    /* renamed from: h */
    public float f46222h;

    /* renamed from: i */
    public long f46223i;

    /* renamed from: j */
    public float f46224j;

    /* renamed from: k */
    public final ArrayList f46225k;

    /* renamed from: l */
    public final ArrayList f46226l;

    /* renamed from: o.t16$a */
    public static class C16959a extends AbstractC16977s {
        public C16959a(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getY();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: o.t16$b */
    public static class C16960b extends AbstractC16977s {
        public C16960b(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return wvi.m55100M(view);
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            wvi.F0(view, f);
        }
    }

    /* renamed from: o.t16$c */
    public static class C16961c extends AbstractC16977s {
        public C16961c(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getAlpha();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: o.t16$d */
    public static class C16962d extends AbstractC16977s {
        public C16962d(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getScrollX();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: o.t16$e */
    public static class C16963e extends AbstractC16977s {
        public C16963e(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getScrollY();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: o.t16$f */
    public class C16964f extends l37 {

        /* renamed from: b */
        public final /* synthetic */ p37 f46227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16964f(String str, p37 p37Var) {
            super(str);
            this.f46227b = p37Var;
        }

        @Override // p001o.l37
        /* renamed from: a */
        public float mo14230a(Object obj) {
            return this.f46227b.m42946a();
        }

        @Override // p001o.l37
        /* renamed from: b */
        public void mo14231b(Object obj, float f) {
            this.f46227b.m42947b(f);
        }
    }

    /* renamed from: o.t16$g */
    public static class C16965g extends AbstractC16977s {
        public C16965g(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getTranslationX();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: o.t16$h */
    public static class C16966h extends AbstractC16977s {
        public C16966h(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getTranslationY();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: o.t16$i */
    public static class C16967i extends AbstractC16977s {
        public C16967i(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return wvi.m55097J(view);
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            wvi.D0(view, f);
        }
    }

    /* renamed from: o.t16$j */
    public static class C16968j extends AbstractC16977s {
        public C16968j(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getScaleX();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: o.t16$k */
    public static class C16969k extends AbstractC16977s {
        public C16969k(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getScaleY();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: o.t16$l */
    public static class C16970l extends AbstractC16977s {
        public C16970l(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getRotation();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: o.t16$m */
    public static class C16971m extends AbstractC16977s {
        public C16971m(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getRotationX();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: o.t16$n */
    public static class C16972n extends AbstractC16977s {
        public C16972n(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getRotationY();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: o.t16$o */
    public static class C16973o extends AbstractC16977s {
        public C16973o(String str) {
            super(str, null);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(View view) {
            return view.getX();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: o.t16$p */
    public static class C16974p {

        /* renamed from: a */
        public float f46229a;

        /* renamed from: b */
        public float f46230b;
    }

    /* renamed from: o.t16$q */
    public interface InterfaceC16975q {
        /* renamed from: a */
        void mo29548a(t16 t16Var, boolean z, float f, float f2);
    }

    /* renamed from: o.t16$r */
    public interface InterfaceC16976r {
        /* renamed from: k */
        void mo9902k(t16 t16Var, float f, float f2);
    }

    /* renamed from: o.t16$s */
    public static abstract class AbstractC16977s extends l37 {
        public /* synthetic */ AbstractC16977s(String str, C16965g c16965g) {
            this(str);
        }

        public AbstractC16977s(String str) {
            super(str);
        }
    }

    public t16(p37 p37Var) {
        this.f46215a = 0.0f;
        this.f46216b = Float.MAX_VALUE;
        this.f46217c = false;
        this.f46220f = false;
        this.f46221g = Float.MAX_VALUE;
        this.f46222h = -Float.MAX_VALUE;
        this.f46223i = 0L;
        this.f46225k = new ArrayList();
        this.f46226l = new ArrayList();
        this.f46218d = null;
        this.f46219e = new C16964f("FloatValueHolder", p37Var);
        this.f46224j = 1.0f;
    }

    /* renamed from: h */
    public static void m49128h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // p001o.fh0.InterfaceC13428b
    /* renamed from: a */
    public boolean mo26684a(long j) {
        long j2 = this.f46223i;
        if (j2 == 0) {
            this.f46223i = j;
            m49138l(this.f46216b);
            return false;
        }
        this.f46223i = j;
        boolean zMo49144r = mo49144r(j - j2);
        float fMin = Math.min(this.f46216b, this.f46221g);
        this.f46216b = fMin;
        float fMax = Math.max(fMin, this.f46222h);
        this.f46216b = fMax;
        m49138l(fMax);
        if (zMo49144r) {
            m49131d(false);
        }
        return zMo49144r;
    }

    /* renamed from: b */
    public t16 m49129b(InterfaceC16975q interfaceC16975q) {
        if (!this.f46225k.contains(interfaceC16975q)) {
            this.f46225k.add(interfaceC16975q);
        }
        return this;
    }

    /* renamed from: c */
    public t16 m49130c(InterfaceC16976r interfaceC16976r) {
        if (m49134g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f46226l.contains(interfaceC16976r)) {
            this.f46226l.add(interfaceC16976r);
        }
        return this;
    }

    /* renamed from: d */
    public final void m49131d(boolean z) {
        this.f46220f = false;
        fh0.m26676d().m26682g(this);
        this.f46223i = 0L;
        this.f46217c = false;
        for (int i = 0; i < this.f46225k.size(); i++) {
            if (this.f46225k.get(i) != null) {
                ((InterfaceC16975q) this.f46225k.get(i)).mo29548a(this, z, this.f46216b, this.f46215a);
            }
        }
        m49128h(this.f46225k);
    }

    /* renamed from: e */
    public final float m49132e() {
        return this.f46219e.mo14230a(this.f46218d);
    }

    /* renamed from: f */
    public float m49133f() {
        return this.f46224j * 0.75f;
    }

    /* renamed from: g */
    public boolean m49134g() {
        return this.f46220f;
    }

    /* renamed from: i */
    public t16 m49135i(float f) {
        this.f46221g = f;
        return this;
    }

    /* renamed from: j */
    public t16 m49136j(float f) {
        this.f46222h = f;
        return this;
    }

    /* renamed from: k */
    public t16 m49137k(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f46224j = f;
        mo49141o(f * 0.75f);
        return this;
    }

    /* renamed from: l */
    public void m49138l(float f) {
        this.f46219e.mo14231b(this.f46218d, f);
        for (int i = 0; i < this.f46226l.size(); i++) {
            if (this.f46226l.get(i) != null) {
                ((InterfaceC16976r) this.f46226l.get(i)).mo9902k(this, this.f46216b, this.f46215a);
            }
        }
        m49128h(this.f46226l);
    }

    /* renamed from: m */
    public t16 m49139m(float f) {
        this.f46216b = f;
        this.f46217c = true;
        return this;
    }

    /* renamed from: n */
    public t16 m49140n(float f) {
        this.f46215a = f;
        return this;
    }

    /* renamed from: o */
    public abstract void mo49141o(float f);

    /* renamed from: p */
    public void mo49142p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f46220f) {
            return;
        }
        m49143q();
    }

    /* renamed from: q */
    public final void m49143q() {
        if (this.f46220f) {
            return;
        }
        this.f46220f = true;
        if (!this.f46217c) {
            this.f46216b = m49132e();
        }
        float f = this.f46216b;
        if (f > this.f46221g || f < this.f46222h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        fh0.m26676d().m26677a(this, 0L);
    }

    /* renamed from: r */
    public abstract boolean mo49144r(long j);

    public t16(Object obj, l37 l37Var) {
        this.f46215a = 0.0f;
        this.f46216b = Float.MAX_VALUE;
        this.f46217c = false;
        this.f46220f = false;
        this.f46221g = Float.MAX_VALUE;
        this.f46222h = -Float.MAX_VALUE;
        this.f46223i = 0L;
        this.f46225k = new ArrayList();
        this.f46226l = new ArrayList();
        this.f46218d = obj;
        this.f46219e = l37Var;
        if (l37Var != f46206r && l37Var != f46207s && l37Var != f46208t) {
            if (l37Var == f46212x) {
                this.f46224j = 0.00390625f;
                return;
            } else if (l37Var != f46204p && l37Var != f46205q) {
                this.f46224j = 1.0f;
                return;
            } else {
                this.f46224j = 0.00390625f;
                return;
            }
        }
        this.f46224j = 0.1f;
    }
}
