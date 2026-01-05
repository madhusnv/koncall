package p001o;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC1782a;

/* loaded from: classes3.dex */
public class nta extends DialogInterfaceC1782a.a {

    /* renamed from: e */
    public static final int f37291e = z5e.alertDialogStyle;

    /* renamed from: f */
    public static final int f37292f = pae.MaterialAlertDialog_MaterialComponents;

    /* renamed from: g */
    public static final int f37293g = x5e.materialAlertDialogTheme;

    /* renamed from: c */
    public Drawable f37294c;

    /* renamed from: d */
    public final Rect f37295d;

    public nta(Context context) {
        this(context, 0);
    }

    /* renamed from: n */
    public static Context m41127n(Context context) {
        int iM41128o = m41128o(context);
        Context contextM29680d = gza.m29680d(context, null, f37291e, f37292f);
        return iM41128o == 0 ? contextM29680d : new i64(contextM29680d, iM41128o);
    }

    /* renamed from: o */
    public static int m41128o(Context context) {
        TypedValue typedValueM42657a = ota.m42657a(context, f37293g);
        if (typedValueM42657a == null) {
            return 0;
        }
        return typedValueM42657a.data;
    }

    /* renamed from: p */
    public static int m41129p(Context context, int i) {
        return i == 0 ? m41128o(context) : i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public nta mo3877j(DialogInterface.OnKeyListener onKeyListener) {
        return (nta) super.mo3877j(onKeyListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public nta setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public nta mo3878k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.mo3878k(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public nta mo3879l(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.mo3879l(listAdapter, i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public nta setTitle(CharSequence charSequence) {
        return (nta) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public nta setView(View view) {
        return (nta) super.setView(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    public DialogInterfaceC1782a create() {
        DialogInterfaceC1782a dialogInterfaceC1782aCreate = super.create();
        Window window = dialogInterfaceC1782aCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f37294c;
        if (drawable instanceof zya) {
            ((zya) drawable).f0(decorView.getElevation());
        }
        window.setBackgroundDrawable(kua.m36246b(this.f37294c, this.f37295d));
        decorView.setOnTouchListener(new rj8(dialogInterfaceC1782aCreate, this.f37295d));
        return dialogInterfaceC1782aCreate;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public nta mo3868a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.mo3868a(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public nta mo3869b(boolean z) {
        return (nta) super.mo3869b(z);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public nta mo3870c(View view) {
        return (nta) super.mo3870c(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public nta mo3871d(Drawable drawable) {
        return (nta) super.mo3871d(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public nta mo3872e(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.mo3872e(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public nta mo3873f(CharSequence charSequence) {
        return (nta) super.mo3873f(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public nta setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public nta mo3874g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.mo3874g(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public nta mo3875h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (nta) super.mo3875h(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public nta mo3876i(DialogInterface.OnCancelListener onCancelListener) {
        return (nta) super.mo3876i(onCancelListener);
    }

    public nta(Context context, int i) {
        super(m41127n(context), m41129p(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = f37291e;
        int i3 = f37292f;
        this.f37295d = kua.m36245a(context2, i2, i3);
        int iM29504c = gua.m29504c(context2, x5e.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, ebe.MaterialAlertDialog, i2, i3);
        int color = typedArrayObtainStyledAttributes.getColor(ebe.MaterialAlertDialog_backgroundTint, iM29504c);
        typedArrayObtainStyledAttributes.recycle();
        zya zyaVar = new zya(context2, null, i2, i3);
        zyaVar.m60115U(context2);
        zyaVar.g0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                zyaVar.c0(dimension);
            }
        }
        this.f37294c = zyaVar;
    }
}
