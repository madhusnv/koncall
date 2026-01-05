package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import p001o.ama;
import p001o.cma;
import p001o.ema;
import p001o.f3d;
import p001o.h6e;
import p001o.hb7;
import p001o.hri;
import p001o.ima;
import p001o.jc8;
import p001o.lk0;
import p001o.ltf;
import p001o.mma;
import p001o.nma;
import p001o.oma;
import p001o.qma;
import p001o.rgh;
import p001o.rja;
import p001o.sie;
import p001o.tq;
import p001o.ve9;
import p001o.wvi;
import p001o.yae;
import p001o.yc9;

/* loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final ima n0 = new C2677a();

    /* renamed from: H */
    public boolean f10581H;

    /* renamed from: L */
    public boolean f10582L;

    /* renamed from: M */
    public boolean f10583M;

    /* renamed from: Q */
    public boolean f10584Q;

    /* renamed from: d */
    public final ima f10585d;

    /* renamed from: e */
    public final ima f10586e;

    /* renamed from: f */
    public ima f10587f;

    /* renamed from: g */
    public int f10588g;

    /* renamed from: h */
    public final ema f10589h;
    public boolean h0;
    public sie i0;
    public final Set j0;
    public int k0;
    public oma l0;
    public ama m0;

    /* renamed from: q */
    public boolean f10590q;

    /* renamed from: s */
    public String f10591s;

    /* renamed from: x */
    public int f10592x;

    /* renamed from: y */
    public boolean f10593y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2676a();

        /* renamed from: a */
        public String f10594a;

        /* renamed from: b */
        public int f10595b;

        /* renamed from: c */
        public float f10596c;

        /* renamed from: d */
        public boolean f10597d;

        /* renamed from: e */
        public String f10598e;

        /* renamed from: f */
        public int f10599f;

        /* renamed from: g */
        public int f10600g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        public class C2676a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C2677a c2677a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f10594a);
            parcel.writeFloat(this.f10596c);
            parcel.writeInt(this.f10597d ? 1 : 0);
            parcel.writeString(this.f10598e);
            parcel.writeInt(this.f10599f);
            parcel.writeInt(this.f10600g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f10594a = parcel.readString();
            this.f10596c = parcel.readFloat();
            this.f10597d = parcel.readInt() == 1;
            this.f10598e = parcel.readString();
            this.f10599f = parcel.readInt();
            this.f10600g = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C2677a implements ima {
        @Override // p001o.ima
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (!hri.m31031k(th)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            rja.m46867d("Unable to load composition.", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public class C2678b implements ima {
        public C2678b() {
        }

        @Override // p001o.ima
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ama amaVar) {
            LottieAnimationView.this.setComposition(amaVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public class C2679c implements ima {
        public C2679c() {
        }

        @Override // p001o.ima
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f10588g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f10588g);
            }
            (LottieAnimationView.this.f10587f == null ? LottieAnimationView.n0 : LottieAnimationView.this.f10587f).onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    public class CallableC2680d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ int f10603a;

        public CallableC2680d(int i) {
            this.f10603a = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nma call() {
            return LottieAnimationView.this.h0 ? cma.m21404o(LottieAnimationView.this.getContext(), this.f10603a) : cma.m21405p(LottieAnimationView.this.getContext(), this.f10603a, null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$e */
    public class CallableC2681e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ String f10605a;

        public CallableC2681e(String str) {
            this.f10605a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nma call() {
            return LottieAnimationView.this.h0 ? cma.m21395f(LottieAnimationView.this.getContext(), this.f10605a) : cma.m21396g(LottieAnimationView.this.getContext(), this.f10605a, null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$f */
    public static /* synthetic */ class C2682f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10607a;

        static {
            int[] iArr = new int[sie.values().length];
            f10607a = iArr;
            try {
                iArr[sie.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10607a[sie.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10607a[sie.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f10585d = new C2678b();
        this.f10586e = new C2679c();
        this.f10588g = 0;
        this.f10589h = new ema();
        this.f10593y = false;
        this.f10581H = false;
        this.f10582L = false;
        this.f10583M = false;
        this.f10584Q = false;
        this.h0 = true;
        this.i0 = sie.AUTOMATIC;
        this.j0 = new HashSet();
        this.k0 = 0;
        m10132o(null, h6e.lottieAnimationViewStyle);
    }

    private void setCompositionTask(oma omaVar) {
        m10127j();
        m10126i();
        this.l0 = omaVar.m42431f(this.f10585d).m42430e(this.f10586e);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        ve9.m52656a("buildDrawingCache");
        this.k0++;
        super.buildDrawingCache(z);
        if (this.k0 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(sie.HARDWARE);
        }
        this.k0--;
        ve9.m52657b("buildDrawingCache");
    }

    /* renamed from: g */
    public void m10124g(yc9 yc9Var, Object obj, qma qmaVar) {
        this.f10589h.m25314c(yc9Var, obj, qmaVar);
    }

    public ama getComposition() {
        return this.m0;
    }

    public long getDuration() {
        ama amaVar = this.m0;
        if (amaVar != null) {
            return (long) amaVar.m17440d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f10589h.m25330s();
    }

    public String getImageAssetsFolder() {
        return this.f10589h.m25333v();
    }

    public float getMaxFrame() {
        return this.f10589h.m25334w();
    }

    public float getMinFrame() {
        return this.f10589h.m25336y();
    }

    public f3d getPerformanceTracker() {
        return this.f10589h.m25337z();
    }

    public float getProgress() {
        return this.f10589h.m25288A();
    }

    public int getRepeatCount() {
        return this.f10589h.m25289B();
    }

    public int getRepeatMode() {
        return this.f10589h.m25290C();
    }

    public float getScale() {
        return this.f10589h.m25291D();
    }

    public float getSpeed() {
        return this.f10589h.m25292E();
    }

    /* renamed from: h */
    public void m10125h() {
        this.f10582L = false;
        this.f10581H = false;
        this.f10593y = false;
        this.f10589h.m25319h();
        m10129l();
    }

    /* renamed from: i */
    public final void m10126i() {
        oma omaVar = this.l0;
        if (omaVar != null) {
            omaVar.m42436k(this.f10585d);
            this.l0.m42435j(this.f10586e);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        ema emaVar = this.f10589h;
        if (drawable2 == emaVar) {
            super.invalidateDrawable(emaVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public final void m10127j() {
        this.m0 = null;
        this.f10589h.m25320i();
    }

    /* renamed from: k */
    public void m10128k(boolean z) {
        this.f10589h.m25324m(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10129l() {
        ama amaVar;
        int i;
        int i2 = C2682f.f10607a[this.i0.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2 || i2 != 3) {
                i3 = 1;
            } else {
                ama amaVar2 = this.m0;
                boolean z = false;
                if ((amaVar2 == null || !amaVar2.m17453q() || Build.VERSION.SDK_INT >= 28) && (((amaVar = this.m0) == null || amaVar.m17449m() <= 4) && (i = Build.VERSION.SDK_INT) != 24 && i != 25)) {
                    z = true;
                }
                if (!z) {
                }
            }
        }
        if (i3 != getLayerType()) {
            setLayerType(i3, null);
        }
    }

    /* renamed from: m */
    public final oma m10130m(String str) {
        return isInEditMode() ? new oma(new CallableC2681e(str), true) : this.h0 ? cma.m21393d(getContext(), str) : cma.m21394e(getContext(), str, null);
    }

    /* renamed from: n */
    public final oma m10131n(int i) {
        return isInEditMode() ? new oma(new CallableC2680d(i), true) : this.h0 ? cma.m21402m(getContext(), i) : cma.m21403n(getContext(), i, null);
    }

    /* renamed from: o */
    public final void m10132o(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yae.LottieAnimationView, i, 0);
        this.h0 = typedArrayObtainStyledAttributes.getBoolean(yae.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(yae.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(yae.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(yae.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(yae.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(yae.LottieAnimationView_lottie_autoPlay, false)) {
            this.f10582L = true;
            this.f10584Q = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(yae.LottieAnimationView_lottie_loop, false)) {
            this.f10589h.h0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(yae.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(yae.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(yae.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(yae.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(yae.LottieAnimationView_lottie_progress, 0.0f));
        m10128k(typedArrayObtainStyledAttributes.getBoolean(yae.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_colorFilter)) {
            m10124g(new yc9("**"), mma.f35706K, new qma(new ltf(lk0.m37352a(getContext(), typedArrayObtainStyledAttributes.getResourceId(yae.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_scale)) {
            this.f10589h.k0(typedArrayObtainStyledAttributes.getFloat(yae.LottieAnimationView_lottie_scale, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yae.LottieAnimationView_lottie_renderMode)) {
            int i2 = yae.LottieAnimationView_lottie_renderMode;
            sie sieVar = sie.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i2, sieVar.ordinal());
            if (iOrdinal >= sie.values().length) {
                iOrdinal = sieVar.ordinal();
            }
            setRenderMode(sie.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(yae.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f10589h.m0(Boolean.valueOf(hri.m31026f(getContext()) != 0.0f));
        m10129l();
        this.f10590q = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.f10584Q || this.f10582L) {
            m10135r();
            this.f10584Q = false;
            this.f10582L = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (m10133p()) {
            m10125h();
            this.f10582L = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f10594a;
        this.f10591s = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f10591s);
        }
        int i = savedState.f10595b;
        this.f10592x = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f10596c);
        if (savedState.f10597d) {
            m10135r();
        }
        this.f10589h.m25307T(savedState.f10598e);
        setRepeatMode(savedState.f10599f);
        setRepeatCount(savedState.f10600g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10594a = this.f10591s;
        savedState.f10595b = this.f10592x;
        savedState.f10596c = this.f10589h.m25288A();
        savedState.f10597d = this.f10589h.m25295H() || (!wvi.m55104Q(this) && this.f10582L);
        savedState.f10598e = this.f10589h.m25333v();
        savedState.f10599f = this.f10589h.m25290C();
        savedState.f10600g = this.f10589h.m25289B();
        return savedState;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (this.f10590q) {
            if (!isShown()) {
                if (m10133p()) {
                    m10134q();
                    this.f10581H = true;
                    return;
                }
                return;
            }
            if (this.f10581H) {
                m10136s();
            } else if (this.f10593y) {
                m10135r();
            }
            this.f10581H = false;
            this.f10593y = false;
        }
    }

    /* renamed from: p */
    public boolean m10133p() {
        return this.f10589h.m25295H();
    }

    /* renamed from: q */
    public void m10134q() {
        this.f10584Q = false;
        this.f10582L = false;
        this.f10581H = false;
        this.f10593y = false;
        this.f10589h.m25297J();
        m10129l();
    }

    /* renamed from: r */
    public void m10135r() {
        if (!isShown()) {
            this.f10593y = true;
        } else {
            this.f10589h.m25298K();
            m10129l();
        }
    }

    /* renamed from: s */
    public void m10136s() {
        if (isShown()) {
            this.f10589h.m25300M();
            m10129l();
        } else {
            this.f10593y = false;
            this.f10581H = true;
        }
    }

    public void setAnimation(int i) {
        this.f10592x = i;
        this.f10591s = null;
        setCompositionTask(m10131n(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.h0 ? cma.m21406q(getContext(), str) : cma.m21407r(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f10589h.m25301N(z);
    }

    public void setCacheComposition(boolean z) {
        this.h0 = z;
    }

    public void setComposition(ama amaVar) {
        if (ve9.f50232a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(amaVar);
        }
        this.f10589h.setCallback(this);
        this.m0 = amaVar;
        this.f10583M = true;
        boolean zM25302O = this.f10589h.m25302O(amaVar);
        this.f10583M = false;
        m10129l();
        if (getDrawable() != this.f10589h || zM25302O) {
            if (!zM25302O) {
                m10137t();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.j0.iterator();
            if (it.hasNext()) {
                tq.m50332a(it.next());
                throw null;
            }
        }
    }

    public void setFailureListener(ima imaVar) {
        this.f10587f = imaVar;
    }

    public void setFallbackResource(int i) {
        this.f10588g = i;
    }

    public void setFontAssetDelegate(hb7 hb7Var) {
        this.f10589h.m25303P(hb7Var);
    }

    public void setFrame(int i) {
        this.f10589h.m25304Q(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f10589h.m25305R(z);
    }

    public void setImageAssetDelegate(jc8 jc8Var) {
        this.f10589h.m25306S(jc8Var);
    }

    public void setImageAssetsFolder(String str) {
        this.f10589h.m25307T(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m10126i();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m10126i();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m10126i();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f10589h.m25308U(i);
    }

    public void setMaxProgress(float f) {
        this.f10589h.m25310W(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f10589h.m25312Y(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.f10589h.a0(f, f2);
    }

    public void setMinFrame(int i) {
        this.f10589h.b0(i);
    }

    public void setMinProgress(float f) {
        this.f10589h.d0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f10589h.e0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f10589h.f0(z);
    }

    public void setProgress(float f) {
        this.f10589h.g0(f);
    }

    public void setRenderMode(sie sieVar) {
        this.i0 = sieVar;
        m10129l();
    }

    public void setRepeatCount(int i) {
        this.f10589h.h0(i);
    }

    public void setRepeatMode(int i) {
        this.f10589h.i0(i);
    }

    public void setSafeMode(boolean z) {
        this.f10589h.j0(z);
    }

    public void setScale(float f) {
        this.f10589h.k0(f);
        if (getDrawable() == this.f10589h) {
            m10137t();
        }
    }

    public void setSpeed(float f) {
        this.f10589h.l0(f);
    }

    public void setTextDelegate(rgh rghVar) {
        this.f10589h.n0(rghVar);
    }

    /* renamed from: t */
    public final void m10137t() {
        boolean zM10133p = m10133p();
        setImageDrawable(null);
        setImageDrawable(this.f10589h);
        if (zM10133p) {
            this.f10589h.m25300M();
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        ema emaVar;
        if (!this.f10583M && drawable == (emaVar = this.f10589h) && emaVar.m25295H()) {
            m10134q();
        } else if (!this.f10583M && (drawable instanceof ema)) {
            ema emaVar2 = (ema) drawable;
            if (emaVar2.m25295H()) {
                emaVar2.m25297J();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f10589h.m25309V(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f10589h.m25313Z(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.f10589h.c0(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f10589h.m25311X(i, i2);
    }

    public void setAnimation(String str) {
        this.f10591s = str;
        this.f10592x = 0;
        setCompositionTask(m10130m(str));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(cma.m21407r(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(cma.m21397h(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10585d = new C2678b();
        this.f10586e = new C2679c();
        this.f10588g = 0;
        this.f10589h = new ema();
        this.f10593y = false;
        this.f10581H = false;
        this.f10582L = false;
        this.f10583M = false;
        this.f10584Q = false;
        this.h0 = true;
        this.i0 = sie.AUTOMATIC;
        this.j0 = new HashSet();
        this.k0 = 0;
        m10132o(attributeSet, h6e.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10585d = new C2678b();
        this.f10586e = new C2679c();
        this.f10588g = 0;
        this.f10589h = new ema();
        this.f10593y = false;
        this.f10581H = false;
        this.f10582L = false;
        this.f10583M = false;
        this.f10584Q = false;
        this.h0 = true;
        this.i0 = sie.AUTOMATIC;
        this.j0 = new HashSet();
        this.k0 = 0;
        m10132o(attributeSet, i);
    }
}
