package androidx.mediarouter.app;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC1782a;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.firebase.perf.util.Constants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.objectweb.asm.Opcodes;
import p001o.a9e;
import p001o.b8e;
import p001o.bae;
import p001o.d7b;
import p001o.d9e;
import p001o.f6e;
import p001o.h7e;
import p001o.i9e;
import p001o.jwc;
import p001o.s6c;

/* renamed from: androidx.mediarouter.app.a */
/* loaded from: classes2.dex */
public class DialogC2305a extends DialogInterfaceC1782a {
    public static final boolean c1 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public static final int d1 = (int) TimeUnit.SECONDS.toMillis(30);
    public int A0;
    public int B0;
    public final int C0;
    public Map D0;
    public MediaControllerCompat E0;
    public o F0;
    public PlaybackStateCompat G0;

    /* renamed from: H */
    public ImageButton f8957H;
    public MediaDescriptionCompat H0;
    public n I0;
    public Bitmap J0;
    public Uri K0;

    /* renamed from: L */
    public MediaRouteExpandCollapseButton f8958L;
    public boolean L0;

    /* renamed from: M */
    public FrameLayout f8959M;
    public Bitmap M0;
    public int N0;
    public boolean O0;
    public boolean P0;

    /* renamed from: Q */
    public LinearLayout f8960Q;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public int U0;
    public int V0;
    public Interpolator W0;

    /* renamed from: X */
    public FrameLayout f8961X;
    public Interpolator X0;

    /* renamed from: Y */
    public FrameLayout f8962Y;
    public Interpolator Y0;

    /* renamed from: Z */
    public ImageView f8963Z;
    public Interpolator Z0;
    public final AccessibilityManager a1;

    /* renamed from: b */
    public final C2319g f8964b;
    public Runnable b1;

    /* renamed from: c */
    public final p f8965c;

    /* renamed from: d */
    public final C2319g.h f8966d;

    /* renamed from: e */
    public Context f8967e;

    /* renamed from: f */
    public boolean f8968f;

    /* renamed from: g */
    public boolean f8969g;

    /* renamed from: h */
    public int f8970h;
    public TextView h0;
    public TextView i0;
    public TextView j0;
    public boolean k0;
    public final boolean l0;
    public LinearLayout m0;
    public RelativeLayout n0;
    public LinearLayout o0;
    public View p0;

    /* renamed from: q */
    public View f8971q;
    public OverlayListView q0;
    public r r0;

    /* renamed from: s */
    public Button f8972s;
    public List s0;
    public Set t0;
    public Set u0;
    public Set v0;
    public SeekBar w0;

    /* renamed from: x */
    public Button f8973x;
    public q x0;

    /* renamed from: y */
    public ImageButton f8974y;
    public C2319g.h y0;
    public int z0;

    /* renamed from: androidx.mediarouter.app.a$a */
    public class a implements OverlayListView.C2304a.a {

        /* renamed from: a */
        public final /* synthetic */ C2319g.h f8975a;

        public a(C2319g.h hVar) {
            this.f8975a = hVar;
        }

        @Override // androidx.mediarouter.app.OverlayListView.C2304a.a
        /* renamed from: a */
        public void mo7915a() {
            DialogC2305a.this.v0.remove(this.f8975a);
            DialogC2305a.this.r0.notifyDataSetChanged();
        }
    }

    /* renamed from: androidx.mediarouter.app.a$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            DialogC2305a.this.q0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            DialogC2305a.this.m7926H();
        }
    }

    /* renamed from: androidx.mediarouter.app.a$c */
    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            DialogC2305a.this.m7942q(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.mediarouter.app.a$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogC2305a.this.m7925G();
        }
    }

    /* renamed from: androidx.mediarouter.app.a$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC2305a.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.a$f */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: androidx.mediarouter.app.a$g */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws PendingIntent.CanceledException {
            PendingIntent pendingIntentM3522d;
            MediaControllerCompat mediaControllerCompat = DialogC2305a.this.E0;
            if (mediaControllerCompat == null || (pendingIntentM3522d = mediaControllerCompat.m3522d()) == null) {
                return;
            }
            try {
                pendingIntentM3522d.send();
                DialogC2305a.this.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(pendingIntentM3522d);
                sb.append(" was not sent, it had been canceled.");
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.a$h */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC2305a dialogC2305a = DialogC2305a.this;
            boolean z = !dialogC2305a.Q0;
            dialogC2305a.Q0 = z;
            if (z) {
                dialogC2305a.q0.setVisibility(0);
            }
            DialogC2305a.this.m7921B();
            DialogC2305a.this.m7929K(true);
        }
    }

    /* renamed from: androidx.mediarouter.app.a$i */
    public class i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f8984a;

        public i(boolean z) {
            this.f8984a = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            DialogC2305a.this.f8961X.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            DialogC2305a dialogC2305a = DialogC2305a.this;
            if (dialogC2305a.R0) {
                dialogC2305a.S0 = true;
            } else {
                dialogC2305a.m7930L(this.f8984a);
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.a$j */
    public class j extends Animation {

        /* renamed from: a */
        public final /* synthetic */ int f8986a;

        /* renamed from: b */
        public final /* synthetic */ int f8987b;

        /* renamed from: c */
        public final /* synthetic */ View f8988c;

        public j(int i, int i2, View view) {
            this.f8986a = i;
            this.f8987b = i2;
            this.f8988c = view;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            DialogC2305a.m7916E(this.f8988c, this.f8986a - ((int) ((r3 - this.f8987b) * f)));
        }
    }

    /* renamed from: androidx.mediarouter.app.a$k */
    public class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ Map f8990a;

        /* renamed from: b */
        public final /* synthetic */ Map f8991b;

        public k(Map map, Map map2) {
            this.f8990a = map;
            this.f8991b = map2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            DialogC2305a.this.q0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            DialogC2305a.this.m7936k(this.f8990a, this.f8991b);
        }
    }

    /* renamed from: androidx.mediarouter.app.a$l */
    public class l implements Animation.AnimationListener {
        public l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            DialogC2305a.this.q0.m7903b();
            DialogC2305a dialogC2305a = DialogC2305a.this;
            dialogC2305a.q0.postDelayed(dialogC2305a.b1, dialogC2305a.T0);
        }
    }

    /* renamed from: androidx.mediarouter.app.a$m */
    public final class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (DialogC2305a.this.f8966d.m8338C()) {
                    DialogC2305a.this.f8964b.m8256z(id == 16908313 ? 2 : 1);
                }
                DialogC2305a.this.dismiss();
                return;
            }
            if (id != b8e.mr_control_playback_ctrl) {
                if (id == b8e.mr_close) {
                    DialogC2305a.this.dismiss();
                    return;
                }
                return;
            }
            DialogC2305a dialogC2305a = DialogC2305a.this;
            if (dialogC2305a.E0 == null || (playbackStateCompat = dialogC2305a.G0) == null) {
                return;
            }
            int i = 0;
            int i2 = playbackStateCompat.m3654g() != 3 ? 0 : 1;
            if (i2 != 0 && DialogC2305a.this.m7947x()) {
                DialogC2305a.this.E0.m3523e().mo3556a();
                i = bae.mr_controller_pause;
            } else if (i2 != 0 && DialogC2305a.this.m7949z()) {
                DialogC2305a.this.E0.m3523e().mo3558c();
                i = bae.mr_controller_stop;
            } else if (i2 == 0 && DialogC2305a.this.m7948y()) {
                DialogC2305a.this.E0.m3523e().mo3557b();
                i = bae.mr_controller_play;
            }
            AccessibilityManager accessibilityManager = DialogC2305a.this.a1;
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || i == 0) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(Opcodes.ACC_ENUM);
            accessibilityEventObtain.setPackageName(DialogC2305a.this.f8967e.getPackageName());
            accessibilityEventObtain.setClassName(m.class.getName());
            accessibilityEventObtain.getText().add(DialogC2305a.this.f8967e.getString(i));
            DialogC2305a.this.a1.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    /* renamed from: androidx.mediarouter.app.a$n */
    public class n extends AsyncTask {

        /* renamed from: a */
        public final Bitmap f8995a;

        /* renamed from: b */
        public final Uri f8996b;

        /* renamed from: c */
        public int f8997c;

        /* renamed from: d */
        public long f8998d;

        public n() {
            MediaDescriptionCompat mediaDescriptionCompat = DialogC2305a.this.H0;
            Bitmap bitmapM3452b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.m3452b();
            this.f8995a = DialogC2305a.m7919u(bitmapM3452b) ? null : bitmapM3452b;
            MediaDescriptionCompat mediaDescriptionCompat2 = DialogC2305a.this.H0;
            this.f8996b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.m3453c() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Bitmap doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStreamM7954e;
            Bitmap bitmap = this.f8995a;
            ?? r3 = 0;
            if (bitmap == null) {
                Uri uri = this.f8996b;
                try {
                    if (uri != null) {
                        try {
                            inputStreamM7954e = m7954e(uri);
                            try {
                                if (inputStreamM7954e == null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unable to open: ");
                                    sb.append(this.f8996b);
                                    if (inputStreamM7954e != null) {
                                        try {
                                            inputStreamM7954e.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStreamM7954e, null, options);
                                if (options.outWidth == 0 || options.outHeight == 0) {
                                    try {
                                        inputStreamM7954e.close();
                                    } catch (IOException unused2) {
                                    }
                                    return null;
                                }
                                try {
                                    inputStreamM7954e.reset();
                                } catch (IOException unused3) {
                                    inputStreamM7954e.close();
                                    inputStreamM7954e = m7954e(this.f8996b);
                                    if (inputStreamM7954e == null) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Unable to open: ");
                                        sb2.append(this.f8996b);
                                        if (inputStreamM7954e != null) {
                                            try {
                                                inputStreamM7954e.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        return null;
                                    }
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / DialogC2305a.this.m7943r(options.outWidth, options.outHeight)));
                                if (isCancelled()) {
                                    try {
                                        inputStreamM7954e.close();
                                    } catch (IOException unused5) {
                                    }
                                    return null;
                                }
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM7954e, null, options);
                                try {
                                    inputStreamM7954e.close();
                                } catch (IOException unused6) {
                                }
                                bitmap = bitmapDecodeStream;
                            } catch (IOException unused7) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Unable to open: ");
                                sb3.append(this.f8996b);
                                if (inputStreamM7954e != null) {
                                    try {
                                        inputStreamM7954e.close();
                                    } catch (IOException unused8) {
                                    }
                                }
                                bitmap = null;
                                if (!DialogC2305a.m7919u(bitmap)) {
                                }
                            }
                        } catch (IOException unused9) {
                            inputStreamM7954e = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                } catch (IOException unused10) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        bitmap = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r3 = uri;
                }
            }
            if (!DialogC2305a.m7919u(bitmap)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't use recycled bitmap: ");
                sb4.append(bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                jwc jwcVarM34617a = new jwc.C14672b(bitmap).m34619c(1).m34617a();
                this.f8997c = jwcVarM34617a.m34611f().isEmpty() ? 0 : ((jwc.C14674d) jwcVarM34617a.m34611f().get(0)).m34625e();
            }
            return bitmap;
        }

        /* renamed from: b */
        public Bitmap m7951b() {
            return this.f8995a;
        }

        /* renamed from: c */
        public Uri m7952c() {
            return this.f8996b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            DialogC2305a dialogC2305a = DialogC2305a.this;
            dialogC2305a.I0 = null;
            if (s6c.m47909a(dialogC2305a.J0, this.f8995a) && s6c.m47909a(DialogC2305a.this.K0, this.f8996b)) {
                return;
            }
            DialogC2305a dialogC2305a2 = DialogC2305a.this;
            dialogC2305a2.J0 = this.f8995a;
            dialogC2305a2.M0 = bitmap;
            dialogC2305a2.K0 = this.f8996b;
            dialogC2305a2.N0 = this.f8997c;
            dialogC2305a2.L0 = true;
            DialogC2305a.this.m7927I(SystemClock.uptimeMillis() - this.f8998d > 120);
        }

        /* renamed from: e */
        public final InputStream m7954e(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || FirebaseAnalytics.Param.CONTENT.equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                inputStreamOpenInputStream = DialogC2305a.this.f8967e.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
                int i = DialogC2305a.d1;
                uRLConnection.setConnectTimeout(i);
                uRLConnection.setReadTimeout(i);
                inputStreamOpenInputStream = uRLConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f8998d = SystemClock.uptimeMillis();
            DialogC2305a.this.m7940o();
        }
    }

    /* renamed from: androidx.mediarouter.app.a$o */
    public final class o extends MediaControllerCompat.AbstractC1705a {
        public o() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1705a
        /* renamed from: d */
        public void mo3542d(MediaMetadataCompat mediaMetadataCompat) {
            DialogC2305a.this.H0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.m3489d();
            DialogC2305a.this.m7928J();
            DialogC2305a.this.m7927I(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1705a
        /* renamed from: e */
        public void mo3543e(PlaybackStateCompat playbackStateCompat) {
            DialogC2305a dialogC2305a = DialogC2305a.this;
            dialogC2305a.G0 = playbackStateCompat;
            dialogC2305a.m7927I(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1705a
        /* renamed from: i */
        public void mo3547i() {
            DialogC2305a dialogC2305a = DialogC2305a.this;
            MediaControllerCompat mediaControllerCompat = dialogC2305a.E0;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.m3526h(dialogC2305a.F0);
                DialogC2305a.this.E0 = null;
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.a$p */
    public final class p extends C2319g.a {
        public p() {
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
            DialogC2305a.this.m7927I(true);
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteUnselected(C2319g c2319g, C2319g.h hVar) {
            DialogC2305a.this.m7927I(false);
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteVolumeChanged(C2319g c2319g, C2319g.h hVar) {
            SeekBar seekBar = (SeekBar) DialogC2305a.this.D0.get(hVar);
            int iM8365s = hVar.m8365s();
            if (DialogC2305a.c1) {
                StringBuilder sb = new StringBuilder();
                sb.append("onRouteVolumeChanged(), route.getVolume:");
                sb.append(iM8365s);
            }
            if (seekBar == null || DialogC2305a.this.y0 == hVar) {
                return;
            }
            seekBar.setProgress(iM8365s);
        }
    }

    /* renamed from: androidx.mediarouter.app.a$q */
    public class q implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final Runnable f9002a = new a();

        /* renamed from: androidx.mediarouter.app.a$q$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                DialogC2305a dialogC2305a = DialogC2305a.this;
                if (dialogC2305a.y0 != null) {
                    dialogC2305a.y0 = null;
                    if (dialogC2305a.O0) {
                        dialogC2305a.m7927I(dialogC2305a.P0);
                    }
                }
            }
        }

        public q() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C2319g.h hVar = (C2319g.h) seekBar.getTag();
                if (DialogC2305a.c1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
                    sb.append(i);
                    sb.append(")");
                }
                hVar.m8341G(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            DialogC2305a dialogC2305a = DialogC2305a.this;
            if (dialogC2305a.y0 != null) {
                dialogC2305a.w0.removeCallbacks(this.f9002a);
            }
            DialogC2305a.this.y0 = (C2319g.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            DialogC2305a.this.w0.postDelayed(this.f9002a, 500L);
        }
    }

    /* renamed from: androidx.mediarouter.app.a$r */
    public class r extends ArrayAdapter {

        /* renamed from: a */
        public final float f9005a;

        public r(Context context, List list) {
            super(context, 0, list);
            this.f9005a = AbstractC2307c.m8003h(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(i9e.mr_controller_volume_item, viewGroup, false);
            } else {
                DialogC2305a.this.m7934P(view);
            }
            C2319g.h hVar = (C2319g.h) getItem(i);
            if (hVar != null) {
                boolean zM8370x = hVar.m8370x();
                TextView textView = (TextView) view.findViewById(b8e.mr_name);
                textView.setEnabled(zM8370x);
                textView.setText(hVar.m8359m());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(b8e.mr_volume_slider);
                AbstractC2307c.m8018w(viewGroup.getContext(), mediaRouteVolumeSlider, DialogC2305a.this.q0);
                mediaRouteVolumeSlider.setTag(hVar);
                DialogC2305a.this.D0.put(hVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.m7901c(!zM8370x);
                mediaRouteVolumeSlider.setEnabled(zM8370x);
                if (zM8370x) {
                    if (DialogC2305a.this.m7920A(hVar)) {
                        mediaRouteVolumeSlider.setMax(hVar.m8367u());
                        mediaRouteVolumeSlider.setProgress(hVar.m8365s());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(DialogC2305a.this.x0);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(b8e.mr_volume_item_icon)).setAlpha(zM8370x ? Constants.MAX_HOST_LENGTH : (int) (this.f9005a * 255.0f));
                ((LinearLayout) view.findViewById(b8e.volume_item_container)).setVisibility(DialogC2305a.this.v0.contains(hVar) ? 4 : 0);
                Set set = DialogC2305a.this.t0;
                if (set != null && set.contains(hVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }
    }

    public DialogC2305a(Context context) {
        this(context, 0);
    }

    /* renamed from: E */
    public static void m7916E(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: Q */
    public static boolean m7917Q(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    /* renamed from: s */
    public static int m7918s(View view) {
        return view.getLayoutParams().height;
    }

    /* renamed from: u */
    public static boolean m7919u(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* renamed from: A */
    public boolean m7920A(C2319g.h hVar) {
        return this.k0 && hVar.m8366t() == 1;
    }

    /* renamed from: B */
    public void m7921B() {
        this.W0 = this.Q0 ? this.X0 : this.Y0;
    }

    /* renamed from: C */
    public View m7922C(Bundle bundle) {
        return null;
    }

    /* renamed from: D */
    public final void m7923D(boolean z) {
        List listM8358l = this.f8966d.m8358l();
        if (listM8358l.isEmpty()) {
            this.s0.clear();
            this.r0.notifyDataSetChanged();
            return;
        }
        if (d7b.m22458i(this.s0, listM8358l)) {
            this.r0.notifyDataSetChanged();
            return;
        }
        HashMap mapM22454e = z ? d7b.m22454e(this.q0, this.r0) : null;
        HashMap mapM22453d = z ? d7b.m22453d(this.f8967e, this.q0, this.r0) : null;
        this.t0 = d7b.m22455f(this.s0, listM8358l);
        this.u0 = d7b.m22456g(this.s0, listM8358l);
        this.s0.addAll(0, this.t0);
        this.s0.removeAll(this.u0);
        this.r0.notifyDataSetChanged();
        if (z && this.Q0 && this.t0.size() + this.u0.size() > 0) {
            m7935j(mapM22454e, mapM22453d);
        } else {
            this.t0 = null;
            this.u0 = null;
        }
    }

    /* renamed from: F */
    public final void m7924F(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.E0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.m3526h(this.F0);
            this.E0 = null;
        }
        if (token != null && this.f8969g) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f8967e, token);
            this.E0 = mediaControllerCompat2;
            mediaControllerCompat2.m3524f(this.F0);
            MediaMetadataCompat mediaMetadataCompatM3520b = this.E0.m3520b();
            this.H0 = mediaMetadataCompatM3520b != null ? mediaMetadataCompatM3520b.m3489d() : null;
            this.G0 = this.E0.m3521c();
            m7928J();
            m7927I(false);
        }
    }

    /* renamed from: G */
    public void m7925G() {
        m7939n(true);
        this.q0.requestLayout();
        this.q0.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    /* renamed from: H */
    public void m7926H() {
        Set set = this.t0;
        if (set == null || set.size() == 0) {
            m7942q(true);
        } else {
            m7941p();
        }
    }

    /* renamed from: I */
    public void m7927I(boolean z) {
        if (this.y0 != null) {
            this.O0 = true;
            this.P0 = z | this.P0;
            return;
        }
        this.O0 = false;
        this.P0 = false;
        if (!this.f8966d.m8338C() || this.f8966d.m8369w()) {
            dismiss();
            return;
        }
        if (this.f8968f) {
            this.j0.setText(this.f8966d.m8359m());
            this.f8972s.setVisibility(this.f8966d.m8347a() ? 0 : 8);
            if (this.f8971q == null && this.L0) {
                if (m7919u(this.M0)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't set artwork image with recycled bitmap: ");
                    sb.append(this.M0);
                } else {
                    this.f8963Z.setImageBitmap(this.M0);
                    this.f8963Z.setBackgroundColor(this.N0);
                }
                m7940o();
            }
            m7933O();
            m7932N();
            m7929K(z);
        }
    }

    /* renamed from: J */
    public void m7928J() {
        if (this.f8971q == null && m7946w()) {
            if (!m7945v() || this.l0) {
                n nVar = this.I0;
                if (nVar != null) {
                    nVar.cancel(true);
                }
                n nVar2 = new n();
                this.I0 = nVar2;
                nVar2.execute(new Void[0]);
            }
        }
    }

    /* renamed from: K */
    public void m7929K(boolean z) {
        this.f8961X.requestLayout();
        this.f8961X.getViewTreeObserver().addOnGlobalLayoutListener(new i(z));
    }

    /* renamed from: L */
    public void m7930L(boolean z) {
        int iM7943r;
        Bitmap bitmap;
        int iM7918s = m7918s(this.m0);
        m7916E(this.m0, -1);
        m7931M(m7938m());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        m7916E(this.m0, iM7918s);
        if (this.f8971q == null && (this.f8963Z.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.f8963Z.getDrawable()).getBitmap()) != null) {
            iM7943r = m7943r(bitmap.getWidth(), bitmap.getHeight());
            this.f8963Z.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            iM7943r = 0;
        }
        int iM7944t = m7944t(m7938m());
        int size = this.s0.size();
        int size2 = m7945v() ? this.A0 * this.f8966d.m8358l().size() : 0;
        if (size > 0) {
            size2 += this.C0;
        }
        int iMin = Math.min(size2, this.B0);
        if (!this.Q0) {
            iMin = 0;
        }
        int iMax = Math.max(iM7943r, iMin) + iM7944t;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (this.f8960Q.getMeasuredHeight() - this.f8961X.getMeasuredHeight());
        if (this.f8971q != null || iM7943r <= 0 || iMax > iHeight) {
            if (m7918s(this.q0) + this.m0.getMeasuredHeight() >= this.f8961X.getMeasuredHeight()) {
                this.f8963Z.setVisibility(8);
            }
            iMax = iMin + iM7944t;
            iM7943r = 0;
        } else {
            this.f8963Z.setVisibility(0);
            m7916E(this.f8963Z, iM7943r);
        }
        if (!m7938m() || iMax > iHeight) {
            this.n0.setVisibility(8);
        } else {
            this.n0.setVisibility(0);
        }
        m7931M(this.n0.getVisibility() == 0);
        int iM7944t2 = m7944t(this.n0.getVisibility() == 0);
        int iMax2 = Math.max(iM7943r, iMin) + iM7944t2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        this.m0.clearAnimation();
        this.q0.clearAnimation();
        this.f8961X.clearAnimation();
        if (z) {
            m7937l(this.m0, iM7944t2);
            m7937l(this.q0, iMin);
            m7937l(this.f8961X, iHeight);
        } else {
            m7916E(this.m0, iM7944t2);
            m7916E(this.q0, iMin);
            m7916E(this.f8961X, iHeight);
        }
        m7916E(this.f8959M, rect.height());
        m7923D(z);
    }

    /* renamed from: M */
    public final void m7931M(boolean z) {
        int i2 = 0;
        this.p0.setVisibility((this.o0.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.m0;
        if (this.o0.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7932N() {
        boolean z;
        boolean z2;
        PlaybackStateCompat playbackStateCompat;
        int i2;
        int i3;
        if (!m7938m()) {
            return;
        }
        MediaDescriptionCompat mediaDescriptionCompat = this.H0;
        CharSequence charSequenceM3456f = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.m3456f();
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(charSequenceM3456f);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.H0;
        CharSequence charSequenceM3455e = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.m3455e() : null;
        boolean z5 = !TextUtils.isEmpty(charSequenceM3455e);
        if (this.f8966d.m8362p() != -1) {
            this.h0.setText(bae.mr_controller_casting_screen);
        } else {
            PlaybackStateCompat playbackStateCompat2 = this.G0;
            if (playbackStateCompat2 == null || playbackStateCompat2.m3654g() == 0) {
                this.h0.setText(bae.mr_controller_no_media_selected);
            } else {
                if (z4 || z5) {
                    if (z4) {
                        this.h0.setText(charSequenceM3456f);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z5) {
                        this.i0.setText(charSequenceM3455e);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.h0.setVisibility(!z ? 0 : 8);
                    this.i0.setVisibility(!z2 ? 0 : 8);
                    playbackStateCompat = this.G0;
                    if (playbackStateCompat == null) {
                        boolean z6 = playbackStateCompat.m3654g() == 6 || this.G0.m3654g() == 3;
                        Context context = this.f8974y.getContext();
                        if (z6 && m7947x()) {
                            i2 = f6e.mediaRoutePauseDrawable;
                            i3 = bae.mr_controller_pause;
                        } else if (z6 && m7949z()) {
                            i2 = f6e.mediaRouteStopDrawable;
                            i3 = bae.mr_controller_stop;
                        } else if (z6 || !m7948y()) {
                            i2 = 0;
                            i3 = 0;
                            z3 = false;
                        } else {
                            i2 = f6e.mediaRoutePlayDrawable;
                            i3 = bae.mr_controller_play;
                        }
                        this.f8974y.setVisibility(z3 ? 0 : 8);
                        if (z3) {
                            this.f8974y.setImageResource(AbstractC2307c.m8011p(context, i2));
                            this.f8974y.setContentDescription(context.getResources().getText(i3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.h0.setText(bae.mr_controller_no_info_available);
            }
        }
        z = true;
        z2 = false;
        this.h0.setVisibility(!z ? 0 : 8);
        this.i0.setVisibility(!z2 ? 0 : 8);
        playbackStateCompat = this.G0;
        if (playbackStateCompat == null) {
        }
    }

    /* renamed from: O */
    public final void m7933O() {
        if (!this.l0 && m7945v()) {
            this.o0.setVisibility(8);
            this.Q0 = true;
            this.q0.setVisibility(0);
            m7921B();
            m7929K(false);
            return;
        }
        if ((this.Q0 && !this.l0) || !m7920A(this.f8966d)) {
            this.o0.setVisibility(8);
        } else if (this.o0.getVisibility() == 8) {
            this.o0.setVisibility(0);
            this.w0.setMax(this.f8966d.m8367u());
            this.w0.setProgress(this.f8966d.m8365s());
            this.f8958L.setVisibility(m7945v() ? 0 : 8);
        }
    }

    /* renamed from: P */
    public void m7934P(View view) {
        m7916E((LinearLayout) view.findViewById(b8e.volume_item_container), this.A0);
        View viewFindViewById = view.findViewById(b8e.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        int i2 = this.z0;
        layoutParams.width = i2;
        layoutParams.height = i2;
        viewFindViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    public final void m7935j(Map map, Map map2) {
        this.q0.setEnabled(false);
        this.q0.requestLayout();
        this.R0 = true;
        this.q0.getViewTreeObserver().addOnGlobalLayoutListener(new k(map, map2));
    }

    /* renamed from: k */
    public void m7936k(Map map, Map map2) {
        OverlayListView.C2304a c2304aM7908d;
        Set set = this.t0;
        if (set == null || this.u0 == null) {
            return;
        }
        int size = set.size() - this.u0.size();
        l lVar = new l();
        int firstVisiblePosition = this.q0.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.q0.getChildCount(); i2++) {
            View childAt = this.q0.getChildAt(i2);
            Object obj = (C2319g.h) this.r0.getItem(firstVisiblePosition + i2);
            Rect rect = (Rect) map.get(obj);
            int top = childAt.getTop();
            int i3 = rect != null ? rect.top : (this.A0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set set2 = this.t0;
            if (set2 != null && set2.contains(obj)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(this.U0);
                animationSet.addAnimation(alphaAnimation);
                i3 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i3 - top, 0.0f);
            translateAnimation.setDuration(this.T0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.W0);
            if (!z) {
                animationSet.setAnimationListener(lVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(obj);
            map2.remove(obj);
        }
        for (Map.Entry entry : map2.entrySet()) {
            C2319g.h hVar = (C2319g.h) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(hVar);
            if (this.u0.contains(hVar)) {
                c2304aM7908d = new OverlayListView.C2304a(bitmapDrawable, rect2).m7907c(1.0f, 0.0f).m7909e(this.V0).m7910f(this.W0);
            } else {
                c2304aM7908d = new OverlayListView.C2304a(bitmapDrawable, rect2).m7911g(this.A0 * size).m7909e(this.T0).m7910f(this.W0).m7908d(new a(hVar));
                this.v0.add(hVar);
            }
            this.q0.m7902a(c2304aM7908d);
        }
    }

    /* renamed from: l */
    public final void m7937l(View view, int i2) {
        j jVar = new j(m7918s(view), i2, view);
        jVar.setDuration(this.T0);
        jVar.setInterpolator(this.W0);
        view.startAnimation(jVar);
    }

    /* renamed from: m */
    public final boolean m7938m() {
        return this.f8971q == null && !(this.H0 == null && this.G0 == null);
    }

    /* renamed from: n */
    public void m7939n(boolean z) {
        Set set;
        int firstVisiblePosition = this.q0.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.q0.getChildCount(); i2++) {
            View childAt = this.q0.getChildAt(i2);
            C2319g.h hVar = (C2319g.h) this.r0.getItem(firstVisiblePosition + i2);
            if (!z || (set = this.t0) == null || !set.contains(hVar)) {
                ((LinearLayout) childAt.findViewById(b8e.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.q0.m7904c();
        if (z) {
            return;
        }
        m7942q(false);
    }

    /* renamed from: o */
    public void m7940o() {
        this.L0 = false;
        this.M0 = null;
        this.N0 = 0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8969g = true;
        this.f8964b.m8239b(C2318f.f9224c, this.f8965c, 2);
        m7924F(this.f8964b.m8244k());
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a, p001o.dk0, p001o.fn3, android.app.Dialog
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(i9e.mr_controller_material_dialog_b);
        findViewById(R.id.button3).setVisibility(8);
        m mVar = new m();
        FrameLayout frameLayout = (FrameLayout) findViewById(b8e.mr_expandable_area);
        this.f8959M = frameLayout;
        frameLayout.setOnClickListener(new e());
        LinearLayout linearLayout = (LinearLayout) findViewById(b8e.mr_dialog_area);
        this.f8960Q = linearLayout;
        linearLayout.setOnClickListener(new f());
        int iM7999d = AbstractC2307c.m7999d(this.f8967e);
        Button button = (Button) findViewById(R.id.button2);
        this.f8972s = button;
        button.setText(bae.mr_controller_disconnect);
        this.f8972s.setTextColor(iM7999d);
        this.f8972s.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(R.id.button1);
        this.f8973x = button2;
        button2.setText(bae.mr_controller_stop_casting);
        this.f8973x.setTextColor(iM7999d);
        this.f8973x.setOnClickListener(mVar);
        this.j0 = (TextView) findViewById(b8e.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(b8e.mr_close);
        this.f8957H = imageButton;
        imageButton.setOnClickListener(mVar);
        this.f8962Y = (FrameLayout) findViewById(b8e.mr_custom_control);
        this.f8961X = (FrameLayout) findViewById(b8e.mr_default_control);
        g gVar = new g();
        ImageView imageView = (ImageView) findViewById(b8e.mr_art);
        this.f8963Z = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(b8e.mr_control_title_container).setOnClickListener(gVar);
        this.m0 = (LinearLayout) findViewById(b8e.mr_media_main_control);
        this.p0 = findViewById(b8e.mr_control_divider);
        this.n0 = (RelativeLayout) findViewById(b8e.mr_playback_control);
        this.h0 = (TextView) findViewById(b8e.mr_control_title);
        this.i0 = (TextView) findViewById(b8e.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(b8e.mr_control_playback_ctrl);
        this.f8974y = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(b8e.mr_volume_control);
        this.o0 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(b8e.mr_volume_slider);
        this.w0 = seekBar;
        seekBar.setTag(this.f8966d);
        q qVar = new q();
        this.x0 = qVar;
        this.w0.setOnSeekBarChangeListener(qVar);
        this.q0 = (OverlayListView) findViewById(b8e.mr_volume_group_list);
        this.s0 = new ArrayList();
        r rVar = new r(this.q0.getContext(), this.s0);
        this.r0 = rVar;
        this.q0.setAdapter((ListAdapter) rVar);
        this.v0 = new HashSet();
        AbstractC2307c.m8016u(this.f8967e, this.m0, this.q0, m7945v());
        AbstractC2307c.m8018w(this.f8967e, (MediaRouteVolumeSlider) this.w0, this.m0);
        HashMap map = new HashMap();
        this.D0 = map;
        map.put(this.f8966d, this.w0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(b8e.mr_group_expand_collapse);
        this.f8958L = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h());
        m7921B();
        this.T0 = this.f8967e.getResources().getInteger(a9e.mr_controller_volume_group_list_animation_duration_ms);
        this.U0 = this.f8967e.getResources().getInteger(a9e.mr_controller_volume_group_list_fade_in_duration_ms);
        this.V0 = this.f8967e.getResources().getInteger(a9e.mr_controller_volume_group_list_fade_out_duration_ms);
        View viewM7922C = m7922C(bundle);
        this.f8971q = viewM7922C;
        if (viewM7922C != null) {
            this.f8962Y.addView(viewM7922C);
            this.f8962Y.setVisibility(0);
        }
        this.f8968f = true;
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f8964b.m8249s(this.f8965c);
        m7924F(null);
        this.f8969g = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.l0 || !this.Q0) {
            this.f8966d.m8342H(i2 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1782a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* renamed from: p */
    public final void m7941p() {
        c cVar = new c();
        int firstVisiblePosition = this.q0.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.q0.getChildCount(); i2++) {
            View childAt = this.q0.getChildAt(i2);
            if (this.t0.contains((C2319g.h) this.r0.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.U0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(cVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    /* renamed from: q */
    public void m7942q(boolean z) {
        this.t0 = null;
        this.u0 = null;
        this.R0 = false;
        if (this.S0) {
            this.S0 = false;
            m7929K(z);
        }
        this.q0.setEnabled(true);
    }

    /* renamed from: r */
    public int m7943r(int i2, int i3) {
        return i2 >= i3 ? (int) (((this.f8970h * i3) / i2) + 0.5f) : (int) (((this.f8970h * 9.0f) / 16.0f) + 0.5f);
    }

    /* renamed from: t */
    public final int m7944t(boolean z) {
        if (!z && this.o0.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + this.m0.getPaddingTop() + this.m0.getPaddingBottom();
        if (z) {
            paddingTop += this.n0.getMeasuredHeight();
        }
        if (this.o0.getVisibility() == 0) {
            paddingTop += this.o0.getMeasuredHeight();
        }
        return (z && this.o0.getVisibility() == 0) ? paddingTop + this.p0.getMeasuredHeight() : paddingTop;
    }

    public void updateLayout() throws Resources.NotFoundException {
        int iM22451b = d7b.m22451b(this.f8967e);
        getWindow().setLayout(iM22451b, -2);
        View decorView = getWindow().getDecorView();
        this.f8970h = (iM22451b - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f8967e.getResources();
        this.z0 = resources.getDimensionPixelSize(h7e.mr_controller_volume_group_list_item_icon_size);
        this.A0 = resources.getDimensionPixelSize(h7e.mr_controller_volume_group_list_item_height);
        this.B0 = resources.getDimensionPixelSize(h7e.mr_controller_volume_group_list_max_height);
        this.J0 = null;
        this.K0 = null;
        m7928J();
        m7927I(false);
    }

    /* renamed from: v */
    public final boolean m7945v() {
        return this.f8966d.m8371y() && this.f8966d.m8358l().size() > 1;
    }

    /* renamed from: w */
    public final boolean m7946w() {
        MediaDescriptionCompat mediaDescriptionCompat = this.H0;
        Bitmap bitmapM3452b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.m3452b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.H0;
        Uri uriM3453c = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.m3453c() : null;
        n nVar = this.I0;
        Bitmap bitmapM7951b = nVar == null ? this.J0 : nVar.m7951b();
        n nVar2 = this.I0;
        Uri uriM7952c = nVar2 == null ? this.K0 : nVar2.m7952c();
        if (bitmapM7951b != bitmapM3452b) {
            return true;
        }
        return bitmapM7951b == null && !m7917Q(uriM7952c, uriM3453c);
    }

    /* renamed from: x */
    public boolean m7947x() {
        return (this.G0.m3649b() & 514) != 0;
    }

    /* renamed from: y */
    public boolean m7948y() {
        return (this.G0.m3649b() & 516) != 0;
    }

    /* renamed from: z */
    public boolean m7949z() {
        return (this.G0.m3649b() & 1) != 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC2305a(Context context, int i2) {
        Context contextM7997b = AbstractC2307c.m7997b(context, i2, true);
        super(contextM7997b, AbstractC2307c.m7998c(contextM7997b));
        this.k0 = true;
        this.b1 = new d();
        this.f8967e = getContext();
        this.F0 = new o();
        C2319g c2319gM8234j = C2319g.m8234j(this.f8967e);
        this.f8964b = c2319gM8234j;
        this.l0 = C2319g.m8235o();
        this.f8965c = new p();
        this.f8966d = c2319gM8234j.m8247n();
        m7924F(c2319gM8234j.m8244k());
        this.C0 = this.f8967e.getResources().getDimensionPixelSize(h7e.mr_controller_volume_group_list_padding_top);
        this.a1 = (AccessibilityManager) this.f8967e.getSystemService("accessibility");
        this.X0 = AnimationUtils.loadInterpolator(contextM7997b, d9e.mr_linear_out_slow_in);
        this.Y0 = AnimationUtils.loadInterpolator(contextM7997b, d9e.mr_fast_out_slow_in);
        this.Z0 = new AccelerateDecelerateInterpolator();
    }
}
