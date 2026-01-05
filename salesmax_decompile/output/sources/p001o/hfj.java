package p001o;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* loaded from: classes2.dex */
public final class hfj {

    /* renamed from: k */
    public static final C13931a f26814k = new C13931a(null);

    /* renamed from: a */
    public final Context f26815a;

    /* renamed from: b */
    public final int f26816b;

    /* renamed from: c */
    public final int f26817c;

    /* renamed from: d */
    public final InterfaceC13932b f26818d;

    /* renamed from: e */
    public boolean f26819e;

    /* renamed from: f */
    public boolean f26820f;

    /* renamed from: g */
    public float f26821g;

    /* renamed from: h */
    public float f26822h;

    /* renamed from: i */
    public int f26823i;

    /* renamed from: j */
    public GestureDetector f26824j;

    /* renamed from: o.hfj$a */
    public static final class C13931a {
        public C13931a() {
        }

        public /* synthetic */ C13931a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.hfj$b */
    public interface InterfaceC13932b {
    }

    /* renamed from: o.hfj$c */
    public static final class C13933c extends GestureDetector.SimpleOnGestureListener {
        public C13933c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            sq8.m48649h(motionEvent, "e");
            hfj.this.f26821g = motionEvent.getX();
            hfj.this.f26822h = motionEvent.getY();
            hfj.this.f26823i = 1;
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hfj(Context context, InterfaceC13932b interfaceC13932b) {
        this(context, 0, 0, interfaceC13932b, 6, null);
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC13932b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public hfj(Context context, int i, int i2, InterfaceC13932b interfaceC13932b) {
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC13932b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26815a = context;
        this.f26816b = i;
        this.f26817c = i2;
        this.f26818d = interfaceC13932b;
        this.f26819e = true;
        this.f26820f = true;
        this.f26824j = new GestureDetector(context, new C13933c());
    }

    public /* synthetic */ hfj(Context context, int i, int i2, InterfaceC13932b interfaceC13932b, int i3, id5 id5Var) {
        this(context, (i3 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i, (i3 & 4) != 0 ? 0 : i2, interfaceC13932b);
    }
}
