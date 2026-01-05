package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;
import p001o.a94;
import p001o.abe;
import p001o.bka;
import p001o.de8;
import p001o.e9g;
import p001o.ee8;
import p001o.gd8;
import p001o.id5;
import p001o.sja;
import p001o.sq8;
import p001o.t7e;
import p001o.umd;
import p001o.v6e;

/* loaded from: classes5.dex */
public final class ProfilePictureView extends FrameLayout {

    /* renamed from: x */
    public static final C10839a f11689x = new C10839a(null);

    /* renamed from: y */
    public static final String f11690y;

    /* renamed from: a */
    public final ImageView f11691a;

    /* renamed from: b */
    public int f11692b;

    /* renamed from: c */
    public int f11693c;

    /* renamed from: d */
    public Bitmap f11694d;

    /* renamed from: e */
    public de8 f11695e;

    /* renamed from: f */
    public Bitmap f11696f;

    /* renamed from: g */
    public umd f11697g;

    /* renamed from: h */
    public String f11698h;

    /* renamed from: q */
    public boolean f11699q;

    /* renamed from: s */
    public int f11700s;

    /* renamed from: com.facebook.login.widget.ProfilePictureView$a */
    public static final class C10839a {
        public C10839a() {
        }

        public /* synthetic */ C10839a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.login.widget.ProfilePictureView$b */
    public interface InterfaceC10840b {
    }

    /* renamed from: com.facebook.login.widget.ProfilePictureView$c */
    public static final class C10841c extends umd {
        public C10841c() {
        }

        @Override // p001o.umd
        /* renamed from: c */
        public void mo13484c(Profile profile, Profile profile2) {
            ProfilePictureView.this.setProfileId(profile2 != null ? profile2.m12928b() : null);
            ProfilePictureView.this.m13480i(true);
        }
    }

    static {
        String simpleName = ProfilePictureView.class.getSimpleName();
        sq8.m48648g(simpleName, "ProfilePictureView::class.java.simpleName");
        f11690y = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f11691a = new ImageView(getContext());
        this.f11699q = true;
        this.f11700s = -1;
        m13476e();
    }

    /* renamed from: k */
    public static final void m13473k(ProfilePictureView profilePictureView, ee8 ee8Var) {
        sq8.m48649h(profilePictureView, "this$0");
        profilePictureView.m13479h(ee8Var);
    }

    private final void setImageBitmap(Bitmap bitmap) {
        if (a94.m16694d(this) || bitmap == null) {
            return;
        }
        try {
            this.f11694d = bitmap;
            this.f11691a.setImageBitmap(bitmap);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: c */
    public final int m13474c(boolean z) {
        int i;
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            int i2 = this.f11700s;
            if (i2 == -1 && !z) {
                return 0;
            }
            if (i2 == -4) {
                i = v6e.com_facebook_profilepictureview_preset_size_large;
            } else if (i2 == -3) {
                i = v6e.com_facebook_profilepictureview_preset_size_normal;
            } else if (i2 == -2) {
                i = v6e.com_facebook_profilepictureview_preset_size_small;
            } else {
                if (i2 != -1) {
                    return 0;
                }
                i = v6e.com_facebook_profilepictureview_preset_size_normal;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    /* renamed from: d */
    public final Uri m13475d(String str) {
        Profile profileM12935b = Profile.f11367h.m12935b();
        return (profileM12935b == null || !AccessToken.f11242y.m12777h()) ? de8.f19636f.m22847a(this.f11698h, this.f11693c, this.f11692b, str) : profileM12935b.m12930d(this.f11693c, this.f11692b);
    }

    /* renamed from: e */
    public final void m13476e() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            removeAllViews();
            this.f11691a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f11691a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.f11691a);
            this.f11697g = new C10841c();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public final boolean m13477f() {
        return this.f11693c == 0 && this.f11692b == 0;
    }

    /* renamed from: g */
    public final void m13478g(AttributeSet attributeSet) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, abe.com_facebook_profile_picture_view);
            sq8.m48648g(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ook_profile_picture_view)");
            setPresetSize(typedArrayObtainStyledAttributes.getInt(abe.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
            setCropped(typedArrayObtainStyledAttributes.getBoolean(abe.com_facebook_profile_picture_view_com_facebook_is_cropped, true));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public final InterfaceC10840b getOnErrorListener() {
        return null;
    }

    public final int getPresetSize() {
        return this.f11700s;
    }

    public final String getProfileId() {
        return this.f11698h;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        umd umdVar = this.f11697g;
        if (umdVar != null) {
            return umdVar.m51789b();
        }
        return false;
    }

    /* renamed from: h */
    public final void m13479h(ee8 ee8Var) {
        if (a94.m16694d(this) || ee8Var == null) {
            return;
        }
        try {
            if (sq8.m48644c(ee8Var.m24842c(), this.f11695e)) {
                this.f11695e = null;
                Bitmap bitmapM24840a = ee8Var.m24840a();
                Exception excM24841b = ee8Var.m24841b();
                if (excM24841b != null) {
                    sja.f45482e.m48386a(bka.REQUESTS, 6, f11690y, excM24841b.toString());
                } else if (bitmapM24840a != null) {
                    setImageBitmap(bitmapM24840a);
                    if (ee8Var.m24843d()) {
                        m13481j(false);
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: i */
    public final void m13480i(boolean z) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            boolean zM13483m = m13483m();
            String str = this.f11698h;
            if (str != null) {
                if (!(str.length() == 0) && !m13477f()) {
                    if (zM13483m || z) {
                        m13481j(true);
                        return;
                    }
                    return;
                }
            }
            m13482l();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: j */
    public final void m13481j(boolean z) {
        AccessToken accessTokenM12774e;
        String strM12760l;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            AccessToken.C10742c c10742c = AccessToken.f11242y;
            String str = "";
            if (c10742c.m12776g() && (accessTokenM12774e = c10742c.m12774e()) != null && (strM12760l = accessTokenM12774e.m12760l()) != null) {
                str = strM12760l;
            }
            Uri uriM13475d = m13475d(str);
            Context context = getContext();
            sq8.m48648g(context, "context");
            de8 de8VarM22842a = new de8.C12878a(context, uriM13475d).m22843b(z).m22845d(this).m22844c(new de8.InterfaceC12879b() { // from class: o.smd
                @Override // p001o.de8.InterfaceC12879b
                /* renamed from: a */
                public final void mo22846a(ee8 ee8Var) {
                    ProfilePictureView.m13473k(this.f45647a, ee8Var);
                }
            }).m22842a();
            de8 de8Var = this.f11695e;
            if (de8Var != null) {
                gd8.m28481d(de8Var);
            }
            this.f11695e = de8VarM22842a;
            gd8.m28482f(de8VarM22842a);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: l */
    public final void m13482l() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            de8 de8Var = this.f11695e;
            if (de8Var != null) {
                gd8.m28481d(de8Var);
            }
            Bitmap bitmap = this.f11696f;
            if (bitmap == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), this.f11699q ? t7e.com_facebook_profile_picture_blank_square : t7e.com_facebook_profile_picture_blank_portrait));
                return;
            }
            m13483m();
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f11693c, this.f11692b, false);
            sq8.m48648g(bitmapCreateScaledBitmap, "createScaledBitmap(custo…idth, queryHeight, false)");
            setImageBitmap(bitmapCreateScaledBitmap);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: m */
    public final boolean m13483m() {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1 && height >= 1) {
                int iM13474c = m13474c(false);
                if (iM13474c != 0) {
                    height = iM13474c;
                    width = height;
                }
                if (width <= height) {
                    height = this.f11699q ? width : 0;
                } else {
                    width = this.f11699q ? height : 0;
                }
                if (width == this.f11693c && height == this.f11692b) {
                    z = false;
                }
                this.f11693c = width;
                this.f11692b = height;
                return z;
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11695e = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m13480i(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = m13474c(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = m13474c(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z2) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        sq8.m48649h(parcelable, "state");
        if (!sq8.m48644c(parcelable.getClass(), Bundle.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        setProfileId(bundle.getString("ProfilePictureView_profileId"));
        setPresetSize(bundle.getInt("ProfilePictureView_presetSize"));
        setCropped(bundle.getBoolean("ProfilePictureView_isCropped"));
        this.f11693c = bundle.getInt("ProfilePictureView_width");
        this.f11692b = bundle.getInt("ProfilePictureView_height");
        m13480i(true);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelableOnSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f11698h);
        bundle.putInt("ProfilePictureView_presetSize", this.f11700s);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f11699q);
        bundle.putInt("ProfilePictureView_width", this.f11693c);
        bundle.putInt("ProfilePictureView_height", this.f11692b);
        bundle.putBoolean("ProfilePictureView_refresh", this.f11695e != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.f11699q = z;
        m13480i(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f11696f = bitmap;
    }

    public final void setOnErrorListener(InterfaceC10840b interfaceC10840b) {
    }

    public final void setPresetSize(int i) {
        if (i != -4 && i != -3 && i != -2 && i != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.f11700s = i;
        requestLayout();
    }

    public final void setProfileId(String str) {
        String str2 = this.f11698h;
        boolean z = true;
        if ((str2 == null || str2.length() == 0) || !e9g.m24606x(this.f11698h, str, true)) {
            m13482l();
        } else {
            z = false;
        }
        this.f11698h = str;
        m13480i(z);
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        if (z) {
            umd umdVar = this.f11697g;
            if (umdVar != null) {
                umdVar.m51790d();
                return;
            }
            return;
        }
        umd umdVar2 = this.f11697g;
        if (umdVar2 != null) {
            umdVar2.m51791e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        this.f11691a = new ImageView(getContext());
        this.f11699q = true;
        this.f11700s = -1;
        m13476e();
        m13478g(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        this.f11691a = new ImageView(getContext());
        this.f11699q = true;
        this.f11700s = -1;
        m13476e();
        m13478g(attributeSet);
    }
}
