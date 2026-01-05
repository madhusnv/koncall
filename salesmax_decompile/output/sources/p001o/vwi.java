package p001o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public abstract class vwi {

    /* renamed from: o.vwi$a */
    public static final class C17685a extends qre implements nl7 {

        /* renamed from: b */
        public int f50967b;

        /* renamed from: c */
        public /* synthetic */ Object f50968c;

        /* renamed from: d */
        public final /* synthetic */ View f50969d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17685a(View view, n64 n64Var) {
            super(2, n64Var);
            this.f50969d = view;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17685a c17685a = new C17685a(this.f50969d, n64Var);
            c17685a.f50968c = obj;
            return c17685a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kef kefVar, n64 n64Var) {
            return ((C17685a) create(kefVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            kef kefVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f50967b;
            if (i == 0) {
                wre.m54934b(obj);
                kefVar = (kef) this.f50968c;
                View view = this.f50969d;
                this.f50968c = kefVar;
                this.f50967b = 1;
                if (kefVar.mo33661f(view, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                kefVar = (kef) this.f50968c;
                wre.m54934b(obj);
            }
            View view2 = this.f50969d;
            if (view2 instanceof ViewGroup) {
                ief iefVarM38081b = lwi.m38081b((ViewGroup) view2);
                this.f50968c = null;
                this.f50967b = 2;
                if (kefVar.m35549j(iefVarM38081b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vwi$b */
    public /* synthetic */ class C17686b extends dm7 implements xk7 {

        /* renamed from: a */
        public static final C17686b f50970a = new C17686b();

        public C17686b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    /* renamed from: a */
    public static final Bitmap m53509a(View view, Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public static /* synthetic */ Bitmap m53510b(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m53509a(view, config);
    }

    /* renamed from: c */
    public static final ief m53511c(View view) {
        return mef.m38854b(new C17685a(view, null));
    }

    /* renamed from: d */
    public static final ief m53512d(View view) {
        return oef.m42147f(view.getParent(), C17686b.f50970a);
    }
}
