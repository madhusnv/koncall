package p001o;

import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class vhh implements aad {

    /* renamed from: a */
    public final View f50352a;

    /* renamed from: b */
    public final jj8 f50353b;

    /* renamed from: c */
    public final v9d f50354c;

    /* renamed from: d */
    public final Executor f50355d;

    /* renamed from: e */
    public xk7 f50356e;

    /* renamed from: f */
    public xk7 f50357f;

    /* renamed from: g */
    public chh f50358g;

    /* renamed from: h */
    public ef8 f50359h;

    /* renamed from: i */
    public List f50360i;

    /* renamed from: j */
    public final gi9 f50361j;

    /* renamed from: k */
    public final fqb f50362k;

    /* renamed from: o.vhh$a */
    public enum EnumC17588a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* renamed from: o.vhh$b */
    public static final class C17589b extends kf9 implements uk7 {
        public C17589b() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(vhh.this.m52790g(), false);
        }
    }

    /* renamed from: o.vhh$c */
    public static final class C17590c implements ij8 {
        public C17590c() {
        }

        @Override // p001o.ij8
        /* renamed from: a */
        public void mo32185a(KeyEvent keyEvent) {
            sq8.m48649h(keyEvent, "event");
            vhh.this.m52789f().sendKeyEvent(keyEvent);
        }

        @Override // p001o.ij8
        /* renamed from: b */
        public void mo32186b(hfe hfeVar) {
            sq8.m48649h(hfeVar, "ic");
            int size = vhh.this.f50360i.size();
            for (int i = 0; i < size; i++) {
                if (sq8.m48644c(((WeakReference) vhh.this.f50360i.get(i)).get(), hfeVar)) {
                    vhh.this.f50360i.remove(i);
                    return;
                }
            }
        }

        @Override // p001o.ij8
        /* renamed from: c */
        public void mo32187c(int i) {
            vhh.this.f50357f.invoke(df8.m22969i(i));
        }

        @Override // p001o.ij8
        /* renamed from: d */
        public void mo32188d(List list) {
            sq8.m48649h(list, "editCommands");
            vhh.this.f50356e.invoke(list);
        }
    }

    /* renamed from: o.vhh$d */
    public static final class C17591d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17591d f50365a = new C17591d();

        public C17591d() {
            super(1);
        }

        public final void invoke(List list) {
            sq8.m48649h(list, "it");
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vhh$e */
    public static final class C17592e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17592e f50366a = new C17592e();

        public C17592e() {
            super(1);
        }

        /* renamed from: a */
        public final void m52792a(int i) {
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m52792a(((df8) obj).m22975o());
            return y3i.f54824a;
        }
    }

    public vhh(View view, jj8 jj8Var, v9d v9dVar, Executor executor) {
        sq8.m48649h(view, "view");
        sq8.m48649h(jj8Var, "inputMethodManager");
        sq8.m48649h(executor, "inputCommandProcessorExecutor");
        this.f50352a = view;
        this.f50353b = jj8Var;
        this.f50354c = v9dVar;
        this.f50355d = executor;
        this.f50356e = C17591d.f50365a;
        this.f50357f = C17592e.f50366a;
        this.f50358g = new chh("", kih.f32287b.m35767a(), (kih) null, 4, (id5) null);
        this.f50359h = ef8.f21542f.m24921a();
        this.f50360i = new ArrayList();
        this.f50361j = si9.m48361b(cj9.NONE, new C17589b());
        this.f50362k = new fqb(new EnumC17588a[16], 0);
    }

    /* renamed from: e */
    public final InputConnection m52788e(EditorInfo editorInfo) {
        sq8.m48649h(editorInfo, "outAttrs");
        yhh.m57849h(editorInfo, this.f50359h, this.f50358g);
        yhh.m57850i(editorInfo);
        hfe hfeVar = new hfe(this.f50358g, new C17590c(), this.f50359h.m24916b());
        this.f50360i.add(new WeakReference(hfeVar));
        return hfeVar;
    }

    /* renamed from: f */
    public final BaseInputConnection m52789f() {
        return (BaseInputConnection) this.f50361j.getValue();
    }

    /* renamed from: g */
    public final View m52790g() {
        return this.f50352a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vhh(View view, jj8 jj8Var, v9d v9dVar, Executor executor, int i, id5 id5Var) {
        if ((i & 8) != 0) {
            Choreographer choreographer = Choreographer.getInstance();
            sq8.m48648g(choreographer, "getInstance()");
            executor = yhh.m57845d(choreographer);
        }
        this(view, jj8Var, v9dVar, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vhh(View view, v9d v9dVar) {
        this(view, new kj8(view), v9dVar, null, 8, null);
        sq8.m48649h(view, "view");
    }
}
