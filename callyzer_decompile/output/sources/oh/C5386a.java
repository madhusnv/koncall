package oh;

import android.graphics.Paint;
import android.graphics.Path;
import com.skydoves.balloon.internals.DefinitionKt;
import u5.AbstractC7339a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oh.a */
/* loaded from: classes.dex */
public final class C5386a {

    /* renamed from: i */
    public static final int[] f27049i = new int[3];

    /* renamed from: j */
    public static final float[] f27050j = {DefinitionKt.NO_Float_VALUE, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f27051k = new int[4];

    /* renamed from: l */
    public static final float[] f27052l = {DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f27053a;

    /* renamed from: b */
    public final Paint f27054b;

    /* renamed from: c */
    public final Paint f27055c;

    /* renamed from: d */
    public final int f27056d;

    /* renamed from: e */
    public final int f27057e;

    /* renamed from: f */
    public final int f27058f;

    /* renamed from: g */
    public final Path f27059g = new Path();

    /* renamed from: h */
    public final Paint f27060h;

    public C5386a() {
        Paint paint = new Paint();
        this.f27060h = paint;
        Paint paint2 = new Paint();
        this.f27053a = paint2;
        this.f27056d = AbstractC7339a.m13734d(-16777216, 68);
        this.f27057e = AbstractC7339a.m13734d(-16777216, 20);
        this.f27058f = AbstractC7339a.m13734d(-16777216, 0);
        paint2.setColor(this.f27056d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f27054b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f27055c = new Paint(paint3);
    }
}
