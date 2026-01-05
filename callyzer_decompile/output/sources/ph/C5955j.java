package ph;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.skydoves.balloon.internals.DefinitionKt;
import mb.o3;
import og.vb;
import og.wb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.j */
/* loaded from: classes.dex */
public final class C5955j {

    /* renamed from: a */
    public vb f29175a = new C5954i();

    /* renamed from: b */
    public vb f29176b = new C5954i();

    /* renamed from: c */
    public vb f29177c = new C5954i();

    /* renamed from: d */
    public vb f29178d = new C5954i();

    /* renamed from: e */
    public InterfaceC5948c f29179e = new C5946a(DefinitionKt.NO_Float_VALUE);

    /* renamed from: f */
    public InterfaceC5948c f29180f = new C5946a(DefinitionKt.NO_Float_VALUE);

    /* renamed from: g */
    public InterfaceC5948c f29181g = new C5946a(DefinitionKt.NO_Float_VALUE);

    /* renamed from: h */
    public InterfaceC5948c f29182h = new C5946a(DefinitionKt.NO_Float_VALUE);

    /* renamed from: i */
    public C5950e f29183i;

    /* renamed from: j */
    public C5950e f29184j;

    /* renamed from: k */
    public C5950e f29185k;

    /* renamed from: l */
    public C5950e f29186l;

    public C5955j() {
        int i10 = 0;
        this.f29183i = new C5950e(i10);
        this.f29184j = new C5950e(i10);
        this.f29185k = new C5950e(i10);
        this.f29186l = new C5950e(i10);
    }

    /* renamed from: a */
    public static o3 m11992a(Context context, int i10, int i11, C5946a c5946a) throws Resources.NotFoundException {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC0143a.f471t);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            InterfaceC5948c interfaceC5948cM11994c = m11994c(typedArrayObtainStyledAttributes, 5, c5946a);
            InterfaceC5948c interfaceC5948cM11994c2 = m11994c(typedArrayObtainStyledAttributes, 8, interfaceC5948cM11994c);
            InterfaceC5948c interfaceC5948cM11994c3 = m11994c(typedArrayObtainStyledAttributes, 9, interfaceC5948cM11994c);
            InterfaceC5948c interfaceC5948cM11994c4 = m11994c(typedArrayObtainStyledAttributes, 7, interfaceC5948cM11994c);
            InterfaceC5948c interfaceC5948cM11994c5 = m11994c(typedArrayObtainStyledAttributes, 6, interfaceC5948cM11994c);
            o3 o3Var = new o3();
            o3Var.f23372a = wb.m11028a(i13);
            o3Var.f23376e = interfaceC5948cM11994c2;
            o3Var.f23373b = wb.m11028a(i14);
            o3Var.f23377f = interfaceC5948cM11994c3;
            o3Var.f23374c = wb.m11028a(i15);
            o3Var.f23378g = interfaceC5948cM11994c4;
            o3Var.f23375d = wb.m11028a(i16);
            o3Var.f23379h = interfaceC5948cM11994c5;
            return o3Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static o3 m11993b(Context context, AttributeSet attributeSet, int i10, int i11) {
        C5946a c5946a = new C5946a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f465n, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m11992a(context, resourceId, resourceId2, c5946a);
    }

    /* renamed from: c */
    public static InterfaceC5948c m11994c(TypedArray typedArray, int i10, InterfaceC5948c interfaceC5948c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new C5946a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new C5953h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC5948c;
    }

    /* renamed from: d */
    public final boolean m11995d(RectF rectF) {
        boolean z6 = this.f29186l.getClass().equals(C5950e.class) && this.f29184j.getClass().equals(C5950e.class) && this.f29183i.getClass().equals(C5950e.class) && this.f29185k.getClass().equals(C5950e.class);
        float fMo11975a = this.f29179e.mo11975a(rectF);
        return z6 && ((this.f29180f.mo11975a(rectF) > fMo11975a ? 1 : (this.f29180f.mo11975a(rectF) == fMo11975a ? 0 : -1)) == 0 && (this.f29182h.mo11975a(rectF) > fMo11975a ? 1 : (this.f29182h.mo11975a(rectF) == fMo11975a ? 0 : -1)) == 0 && (this.f29181g.mo11975a(rectF) > fMo11975a ? 1 : (this.f29181g.mo11975a(rectF) == fMo11975a ? 0 : -1)) == 0) && ((this.f29176b instanceof C5954i) && (this.f29175a instanceof C5954i) && (this.f29177c instanceof C5954i) && (this.f29178d instanceof C5954i));
    }

    /* renamed from: e */
    public final o3 m11996e() {
        o3 o3Var = new o3();
        o3Var.f23372a = this.f29175a;
        o3Var.f23373b = this.f29176b;
        o3Var.f23374c = this.f29177c;
        o3Var.f23375d = this.f29178d;
        o3Var.f23376e = this.f29179e;
        o3Var.f23377f = this.f29180f;
        o3Var.f23378g = this.f29181g;
        o3Var.f23379h = this.f29182h;
        o3Var.f23380i = this.f29183i;
        o3Var.f23381j = this.f29184j;
        o3Var.f23382k = this.f29185k;
        o3Var.f23383l = this.f29186l;
        return o3Var;
    }
}
