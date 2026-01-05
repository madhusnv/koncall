package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.bae;
import p001o.c7b;
import p001o.f6e;
import p001o.fy5;
import p001o.jsh;
import p001o.lk0;
import p001o.m8b;
import p001o.rae;
import p001o.wvi;

/* loaded from: classes2.dex */
public class MediaRouteButton extends View {
    public static C2300a i0;
    public static final SparseArray j0 = new SparseArray(2);
    public static final int[] k0 = {R.attr.state_checked};
    public static final int[] l0 = {R.attr.state_checkable};

    /* renamed from: H */
    public ColorStateList f8905H;

    /* renamed from: L */
    public int f8906L;

    /* renamed from: M */
    public int f8907M;

    /* renamed from: Q */
    public boolean f8908Q;

    /* renamed from: a */
    public final C2319g f8909a;

    /* renamed from: b */
    public final C2301b f8910b;

    /* renamed from: c */
    public C2318f f8911c;

    /* renamed from: d */
    public c7b f8912d;

    /* renamed from: e */
    public boolean f8913e;

    /* renamed from: f */
    public int f8914f;

    /* renamed from: g */
    public boolean f8915g;

    /* renamed from: h */
    public AsyncTaskC2302c f8916h;
    public boolean h0;

    /* renamed from: q */
    public Drawable f8917q;

    /* renamed from: s */
    public int f8918s;

    /* renamed from: x */
    public int f8919x;

    /* renamed from: y */
    public int f8920y;

    /* renamed from: androidx.mediarouter.app.MediaRouteButton$a */
    public static final class C2300a extends BroadcastReceiver {

        /* renamed from: a */
        public final Context f8921a;

        /* renamed from: b */
        public boolean f8922b = true;

        /* renamed from: c */
        public List f8923c = new ArrayList();

        public C2300a(Context context) {
            this.f8921a = context;
        }

        /* renamed from: a */
        public boolean m7892a() {
            return this.f8922b;
        }

        /* renamed from: b */
        public void m7893b(MediaRouteButton mediaRouteButton) {
            if (this.f8923c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.f8921a.registerReceiver(this, intentFilter);
            }
            this.f8923c.add(mediaRouteButton);
        }

        /* renamed from: c */
        public void m7894c(MediaRouteButton mediaRouteButton) {
            this.f8923c.remove(mediaRouteButton);
            if (this.f8923c.size() == 0) {
                this.f8921a.unregisterReceiver(this);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.f8922b == (!intent.getBooleanExtra("noConnectivity", false))) {
                return;
            }
            this.f8922b = z;
            Iterator it = this.f8923c.iterator();
            while (it.hasNext()) {
                ((MediaRouteButton) it.next()).m7885c();
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.MediaRouteButton$b */
    public final class C2301b extends C2319g.a {
        public C2301b() {
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onProviderAdded(C2319g c2319g, C2319g.g gVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onProviderChanged(C2319g c2319g, C2319g.g gVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onProviderRemoved(C2319g c2319g, C2319g.g gVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteSelected(C2319g c2319g, C2319g.h hVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteUnselected(C2319g c2319g, C2319g.h hVar) {
            MediaRouteButton.this.m7884b();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouterParamsChanged(C2319g c2319g, m8b m8bVar) {
            boolean z = m8bVar != null ? m8bVar.m38556b().getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
            MediaRouteButton mediaRouteButton = MediaRouteButton.this;
            if (mediaRouteButton.f8915g != z) {
                mediaRouteButton.f8915g = z;
                mediaRouteButton.refreshDrawableState();
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.MediaRouteButton$c */
    public final class AsyncTaskC2302c extends AsyncTask {

        /* renamed from: a */
        public final int f8925a;

        /* renamed from: b */
        public final Context f8926b;

        public AsyncTaskC2302c(int i, Context context) {
            this.f8925a = i;
            this.f8926b = context;
        }

        /* renamed from: a */
        public final void m7895a(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.j0.put(this.f8925a, drawable.getConstantState());
            }
            MediaRouteButton.this.f8916h = null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            if (((Drawable.ConstantState) MediaRouteButton.j0.get(this.f8925a)) == null) {
                return lk0.m37353b(this.f8926b, this.f8925a);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Drawable drawable) {
            m7895a(drawable);
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                m7895a(drawable);
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.j0.get(this.f8925a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                MediaRouteButton.this.f8916h = null;
            }
            MediaRouteButton.this.setRemoteIndicatorDrawableInternal(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    /* renamed from: a */
    public final void m7883a() {
        if (this.f8918s > 0) {
            AsyncTaskC2302c asyncTaskC2302c = this.f8916h;
            if (asyncTaskC2302c != null) {
                asyncTaskC2302c.cancel(false);
            }
            AsyncTaskC2302c asyncTaskC2302c2 = new AsyncTaskC2302c(this.f8918s, getContext());
            this.f8916h = asyncTaskC2302c2;
            this.f8918s = 0;
            asyncTaskC2302c2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: b */
    public void m7884b() {
        C2319g.h hVarM8247n = this.f8909a.m8247n();
        boolean z = true;
        boolean z2 = !hVarM8247n.m8369w();
        int iM8349c = z2 ? hVarM8247n.m8349c() : 0;
        if (this.f8920y != iM8349c) {
            this.f8920y = iM8349c;
            m7891i();
            refreshDrawableState();
        }
        if (iM8349c == 1) {
            m7883a();
        }
        if (this.f8913e) {
            if (!this.f8908Q && !z2 && !this.f8909a.m8248q(this.f8911c, 1)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    /* renamed from: c */
    public void m7885c() {
        super.setVisibility((this.f8914f != 0 || this.f8908Q || i0.m7892a()) ? this.f8914f : 4);
        Drawable drawable = this.f8917q;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* renamed from: d */
    public boolean m7886d() {
        if (!this.f8913e) {
            return false;
        }
        m8b m8bVarM8245l = this.f8909a.m8245l();
        if (m8bVarM8245l == null) {
            return m7887e(1);
        }
        if (m8bVarM8245l.m38558d() && C2319g.m8236p() && m7888f()) {
            return true;
        }
        return m7887e(m8bVarM8245l.m38555a());
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f8917q != null) {
            this.f8917q.setState(getDrawableState());
            if (this.f8917q.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f8917q.getCurrent();
                int i = this.f8920y;
                if (i == 1 || this.f8919x != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.f8919x = this.f8920y;
    }

    /* renamed from: e */
    public final boolean m7887e(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (this.f8909a.m8247n().m8369w()) {
            if (fragmentManager.m0("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                return false;
            }
            MediaRouteChooserDialogFragment mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment = this.f8912d.onCreateChooserDialogFragment();
            mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment.setRouteSelector(this.f8911c);
            if (i == 2) {
                mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment.setUseDynamicGroup(true);
            }
            AbstractC2124j abstractC2124jM6205q = fragmentManager.m6205q();
            abstractC2124jM6205q.m6421e(mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
            abstractC2124jM6205q.mo6261i();
        } else {
            if (fragmentManager.m0("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                return false;
            }
            MediaRouteControllerDialogFragment mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment = this.f8912d.onCreateControllerDialogFragment();
            mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment.setRouteSelector(this.f8911c);
            if (i == 2) {
                mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment.setUseDynamicGroup(true);
            }
            AbstractC2124j abstractC2124jM6205q2 = fragmentManager.m6205q();
            abstractC2124jM6205q2.m6421e(mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
            abstractC2124jM6205q2.mo6261i();
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m7888f() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            boolean zM7890h = m7890h();
            return !zM7890h ? m7889g() : zM7890h;
        }
        if (i == 30) {
            return m7889g();
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m7889g() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent intentPutExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", this.f8909a.m8244k());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & Opcodes.LOR) != 0) {
                context.startActivity(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    public c7b getDialogFactory() {
        return this.f8912d;
    }

    public C2318f getRouteSelector() {
        return this.f8911c;
    }

    /* renamed from: h */
    public final boolean m7890h() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent intentPutExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName()).putExtra("key_media_session_token", this.f8909a.m8244k());
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & Opcodes.LOR) != 0) {
                context.sendBroadcast(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m7891i() {
        int i = this.f8920y;
        String string = getContext().getString(i != 1 ? i != 2 ? bae.mr_cast_button_disconnected : bae.mr_cast_button_connected : bae.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.h0 || TextUtils.isEmpty(string)) {
            string = null;
        }
        jsh.m34483a(this, string);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8917q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f8913e = true;
        if (!this.f8911c.m8224f()) {
            this.f8909a.m8238a(this.f8911c, this.f8910b);
        }
        m7884b();
        i0.m7893b(this);
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f8909a == null || this.f8915g) {
            return iArrOnCreateDrawableState;
        }
        int i2 = this.f8920y;
        if (i2 == 1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, l0);
        } else if (i2 == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, k0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f8913e = false;
            if (!this.f8911c.m8224f()) {
                this.f8909a.m8249s(this.f8910b);
            }
            i0.m7894c(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8917q != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.f8917q.getIntrinsicWidth();
            int intrinsicHeight = this.f8917q.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.f8917q.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f8917q.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.f8906L;
        Drawable drawable = this.f8917q;
        int iMax = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i4 = this.f8907M;
        Drawable drawable2 = this.f8917q;
        int iMax2 = Math.max(i4, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        m7883a();
        return m7886d() || zPerformClick;
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.f8908Q) {
            this.f8908Q = z;
            m7885c();
            m7884b();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.h0) {
            this.h0 = z;
            m7891i();
        }
    }

    public void setDialogFactory(c7b c7bVar) {
        if (c7bVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.f8912d = c7bVar;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.f8918s = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        AsyncTaskC2302c asyncTaskC2302c = this.f8916h;
        if (asyncTaskC2302c != null) {
            asyncTaskC2302c.cancel(false);
        }
        Drawable drawable2 = this.f8917q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8917q);
        }
        if (drawable != null) {
            if (this.f8905H != null) {
                drawable = fy5.m27744r(drawable.mutate());
                fy5.m27741o(drawable, this.f8905H);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.f8917q = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f8911c.equals(c2318f)) {
            return;
        }
        if (this.f8913e) {
            if (!this.f8911c.m8224f()) {
                this.f8909a.m8249s(this.f8910b);
            }
            if (!c2318f.m8224f()) {
                this.f8909a.m8238a(c2318f, this.f8910b);
            }
        }
        this.f8911c = c2318f;
        m7884b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.f8914f = i;
        m7885c();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8917q;
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f6e.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        Drawable.ConstantState constantState;
        super(AbstractC2307c.m7996a(context), attributeSet, i);
        this.f8911c = C2318f.f9224c;
        this.f8912d = c7b.getDefault();
        this.f8914f = 0;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, rae.MediaRouteButton, i, 0);
        wvi.k0(this, context2, rae.MediaRouteButton, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.f8909a = null;
            this.f8910b = null;
            this.f8917q = lk0.m37353b(context2, typedArrayObtainStyledAttributes.getResourceId(rae.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
            return;
        }
        C2319g c2319gM8234j = C2319g.m8234j(context2);
        this.f8909a = c2319gM8234j;
        this.f8910b = new C2301b();
        C2319g.h hVarM8247n = c2319gM8234j.m8247n();
        int iM8349c = hVarM8247n.m8369w() ^ true ? hVarM8247n.m8349c() : 0;
        this.f8920y = iM8349c;
        this.f8919x = iM8349c;
        if (i0 == null) {
            i0 = new C2300a(context2.getApplicationContext());
        }
        this.f8905H = typedArrayObtainStyledAttributes.getColorStateList(rae.MediaRouteButton_mediaRouteButtonTint);
        this.f8906L = typedArrayObtainStyledAttributes.getDimensionPixelSize(rae.MediaRouteButton_android_minWidth, 0);
        this.f8907M = typedArrayObtainStyledAttributes.getDimensionPixelSize(rae.MediaRouteButton_android_minHeight, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(rae.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
        this.f8918s = typedArrayObtainStyledAttributes.getResourceId(rae.MediaRouteButton_externalRouteEnabledDrawable, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i2 = this.f8918s;
        if (i2 != 0 && (constantState = (Drawable.ConstantState) j0.get(i2)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.f8917q == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) j0.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    AsyncTaskC2302c asyncTaskC2302c = new AsyncTaskC2302c(resourceId, getContext());
                    this.f8916h = asyncTaskC2302c;
                    asyncTaskC2302c.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                m7883a();
            }
        }
        m7891i();
        setClickable(true);
    }
}
