package p8;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import c6.v0;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.c */
/* loaded from: classes.dex */
public final class C5842c extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f28550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5842c(Class cls, String str, int i10) {
        super(cls, str);
        this.f28550a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f28550a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC5865z.f28643a.mo11415c((View) obj));
            default:
                Field field = v0.f5527a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f28550a) {
            case 0:
                C5845f c5845f = (C5845f) obj;
                PointF pointF = (PointF) obj2;
                c5845f.getClass();
                c5845f.f28563a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c5845f.f28564b = iRound;
                int i10 = c5845f.f28568f + 1;
                c5845f.f28568f = i10;
                if (i10 == c5845f.f28569g) {
                    AbstractC5865z.m11467a(c5845f.f28567e, c5845f.f28563a, iRound, c5845f.f28565c, c5845f.f28566d);
                    c5845f.f28568f = 0;
                    c5845f.f28569g = 0;
                    break;
                }
                break;
            case 1:
                C5845f c5845f2 = (C5845f) obj;
                PointF pointF2 = (PointF) obj2;
                c5845f2.getClass();
                c5845f2.f28565c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c5845f2.f28566d = iRound2;
                int i11 = c5845f2.f28569g + 1;
                c5845f2.f28569g = i11;
                if (c5845f2.f28568f == i11) {
                    AbstractC5865z.m11467a(c5845f2.f28567e, c5845f2.f28563a, c5845f2.f28564b, c5845f2.f28565c, iRound2);
                    c5845f2.f28568f = 0;
                    c5845f2.f28569g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC5865z.m11467a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC5865z.m11467a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC5865z.m11467a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC5865z.f28643a.mo11416d((View) obj, fFloatValue);
                break;
            default:
                Field field = v0.f5527a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
