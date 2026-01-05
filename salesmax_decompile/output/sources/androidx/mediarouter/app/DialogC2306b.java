package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.a9e;
import p001o.b8e;
import p001o.bae;
import p001o.d7b;
import p001o.dk0;
import p001o.h7e;
import p001o.i9e;
import p001o.jwc;
import p001o.s6c;

/* renamed from: androidx.mediarouter.app.b */
/* loaded from: classes2.dex */
public class DialogC2306b extends dk0 {
    public static final boolean D0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public Bitmap A0;
    public int B0;
    public final boolean C0;

    /* renamed from: H */
    public final Handler f9007H;

    /* renamed from: L */
    public RecyclerView f9008L;

    /* renamed from: M */
    public h f9009M;

    /* renamed from: Q */
    public j f9010Q;

    /* renamed from: X */
    public Map f9011X;

    /* renamed from: Y */
    public C2319g.h f9012Y;

    /* renamed from: Z */
    public Map f9013Z;

    /* renamed from: a */
    public final C2319g f9014a;

    /* renamed from: b */
    public final g f9015b;

    /* renamed from: c */
    public C2318f f9016c;

    /* renamed from: d */
    public C2319g.h f9017d;

    /* renamed from: e */
    public final List f9018e;

    /* renamed from: f */
    public final List f9019f;

    /* renamed from: g */
    public final List f9020g;

    /* renamed from: h */
    public final List f9021h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public ImageButton l0;
    public Button m0;
    public ImageView n0;
    public View o0;
    public ImageView p0;

    /* renamed from: q */
    public Context f9022q;
    public TextView q0;
    public TextView r0;

    /* renamed from: s */
    public boolean f9023s;
    public String s0;
    public MediaControllerCompat t0;
    public e u0;
    public MediaDescriptionCompat v0;
    public d w0;

    /* renamed from: x */
    public boolean f9024x;
    public Bitmap x0;

    /* renamed from: y */
    public long f9025y;
    public Uri y0;
    public boolean z0;

    /* renamed from: androidx.mediarouter.app.b$a */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                DialogC2306b.this.m7965p();
                return;
            }
            if (i != 2) {
                return;
            }
            DialogC2306b dialogC2306b = DialogC2306b.this;
            if (dialogC2306b.f9012Y != null) {
                dialogC2306b.f9012Y = null;
                dialogC2306b.m7966q();
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.b$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC2306b.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.b$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DialogC2306b.this.f9017d.m8338C()) {
                DialogC2306b.this.f9014a.m8256z(2);
            }
            DialogC2306b.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.b$d */
    public class d extends AsyncTask {

        /* renamed from: a */
        public final Bitmap f9029a;

        /* renamed from: b */
        public final Uri f9030b;

        /* renamed from: c */
        public int f9031c;

        public d() {
            MediaDescriptionCompat mediaDescriptionCompat = DialogC2306b.this.v0;
            Bitmap bitmapM3452b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.m3452b();
            this.f9029a = DialogC2306b.m7956i(bitmapM3452b) ? null : bitmapM3452b;
            MediaDescriptionCompat mediaDescriptionCompat2 = DialogC2306b.this.v0;
            this.f9030b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.m3453c() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Bitmap doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStreamM7971e;
            Bitmap bitmap = this.f9029a;
            ?? r3 = 0;
            if (bitmap == null) {
                Uri uri = this.f9030b;
                try {
                    if (uri != null) {
                        try {
                            inputStreamM7971e = m7971e(uri);
                            try {
                                if (inputStreamM7971e == null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unable to open: ");
                                    sb.append(this.f9030b);
                                    if (inputStreamM7971e != null) {
                                        try {
                                            inputStreamM7971e.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStreamM7971e, null, options);
                                if (options.outWidth == 0 || options.outHeight == 0) {
                                    try {
                                        inputStreamM7971e.close();
                                    } catch (IOException unused2) {
                                    }
                                    return null;
                                }
                                try {
                                    inputStreamM7971e.reset();
                                } catch (IOException unused3) {
                                    inputStreamM7971e.close();
                                    inputStreamM7971e = m7971e(this.f9030b);
                                    if (inputStreamM7971e == null) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Unable to open: ");
                                        sb2.append(this.f9030b);
                                        if (inputStreamM7971e != null) {
                                            try {
                                                inputStreamM7971e.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        return null;
                                    }
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / DialogC2306b.this.f9022q.getResources().getDimensionPixelSize(h7e.mr_cast_meta_art_size)));
                                if (isCancelled()) {
                                    try {
                                        inputStreamM7971e.close();
                                    } catch (IOException unused5) {
                                    }
                                    return null;
                                }
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM7971e, null, options);
                                try {
                                    inputStreamM7971e.close();
                                } catch (IOException unused6) {
                                }
                                bitmap = bitmapDecodeStream;
                            } catch (IOException unused7) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Unable to open: ");
                                sb3.append(this.f9030b);
                                if (inputStreamM7971e != null) {
                                    try {
                                        inputStreamM7971e.close();
                                    } catch (IOException unused8) {
                                    }
                                }
                                bitmap = null;
                                if (!DialogC2306b.m7956i(bitmap)) {
                                }
                            }
                        } catch (IOException unused9) {
                            inputStreamM7971e = null;
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
            if (!DialogC2306b.m7956i(bitmap)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't use recycled bitmap: ");
                sb4.append(bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                jwc jwcVarM34617a = new jwc.C14672b(bitmap).m34619c(1).m34617a();
                this.f9031c = jwcVarM34617a.m34611f().isEmpty() ? 0 : ((jwc.C14674d) jwcVarM34617a.m34611f().get(0)).m34625e();
            }
            return bitmap;
        }

        /* renamed from: b */
        public Bitmap m7968b() {
            return this.f9029a;
        }

        /* renamed from: c */
        public Uri m7969c() {
            return this.f9030b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            DialogC2306b dialogC2306b = DialogC2306b.this;
            dialogC2306b.w0 = null;
            if (s6c.m47909a(dialogC2306b.x0, this.f9029a) && s6c.m47909a(DialogC2306b.this.y0, this.f9030b)) {
                return;
            }
            DialogC2306b dialogC2306b2 = DialogC2306b.this;
            dialogC2306b2.x0 = this.f9029a;
            dialogC2306b2.A0 = bitmap;
            dialogC2306b2.y0 = this.f9030b;
            dialogC2306b2.B0 = this.f9031c;
            dialogC2306b2.z0 = true;
            dialogC2306b2.m7963n();
        }

        /* renamed from: e */
        public final InputStream m7971e(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || FirebaseAnalytics.Param.CONTENT.equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                inputStreamOpenInputStream = DialogC2306b.this.f9022q.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
                uRLConnection.setConnectTimeout(30000);
                uRLConnection.setReadTimeout(30000);
                inputStreamOpenInputStream = uRLConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            DialogC2306b.this.m7958g();
        }
    }

    /* renamed from: androidx.mediarouter.app.b$e */
    public final class e extends MediaControllerCompat.AbstractC1705a {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1705a
        /* renamed from: d */
        public void mo3542d(MediaMetadataCompat mediaMetadataCompat) {
            DialogC2306b.this.v0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.m3489d();
            DialogC2306b.this.m7960j();
            DialogC2306b.this.m7963n();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1705a
        /* renamed from: i */
        public void mo3547i() {
            DialogC2306b dialogC2306b = DialogC2306b.this;
            MediaControllerCompat mediaControllerCompat = dialogC2306b.t0;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.m3526h(dialogC2306b.u0);
                DialogC2306b.this.t0 = null;
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.b$f */
    public abstract class f extends RecyclerView.d0 {

        /* renamed from: u */
        public C2319g.h f9034u;

        /* renamed from: v */
        public final ImageButton f9035v;

        /* renamed from: w */
        public final MediaRouteVolumeSlider f9036w;

        /* renamed from: androidx.mediarouter.app.b$f$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogC2306b dialogC2306b = DialogC2306b.this;
                if (dialogC2306b.f9012Y != null) {
                    dialogC2306b.f9007H.removeMessages(2);
                }
                f fVar = f.this;
                DialogC2306b.this.f9012Y = fVar.f9034u;
                boolean z = !view.isActivated();
                int iM7973P = z ? 0 : f.this.m7973P();
                f.this.m7974Q(z);
                f.this.f9036w.setProgress(iM7973P);
                f.this.f9034u.m8341G(iM7973P);
                DialogC2306b.this.f9007H.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.f9035v = imageButton;
            this.f9036w = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(AbstractC2307c.m8006k(DialogC2306b.this.f9022q));
            AbstractC2307c.m8017v(DialogC2306b.this.f9022q, mediaRouteVolumeSlider);
        }

        /* renamed from: O */
        public void m7972O(C2319g.h hVar) {
            this.f9034u = hVar;
            int iM8365s = hVar.m8365s();
            this.f9035v.setActivated(iM8365s == 0);
            this.f9035v.setOnClickListener(new a());
            this.f9036w.setTag(this.f9034u);
            this.f9036w.setMax(hVar.m8367u());
            this.f9036w.setProgress(iM8365s);
            this.f9036w.setOnSeekBarChangeListener(DialogC2306b.this.f9010Q);
        }

        /* renamed from: P */
        public int m7973P() {
            Integer num = (Integer) DialogC2306b.this.f9013Z.get(this.f9034u.m8357k());
            if (num == null) {
                return 1;
            }
            return Math.max(1, num.intValue());
        }

        /* renamed from: Q */
        public void m7974Q(boolean z) {
            if (this.f9035v.isActivated() == z) {
                return;
            }
            this.f9035v.setActivated(z);
            if (z) {
                DialogC2306b.this.f9013Z.put(this.f9034u.m8357k(), Integer.valueOf(this.f9036w.getProgress()));
            } else {
                DialogC2306b.this.f9013Z.remove(this.f9034u.m8357k());
            }
        }

        /* renamed from: R */
        public void m7975R() {
            int iM8365s = this.f9034u.m8365s();
            m7974Q(iM8365s == 0);
            this.f9036w.setProgress(iM8365s);
        }
    }

    /* renamed from: androidx.mediarouter.app.b$g */
    public final class g extends C2319g.a {
        public g() {
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
            DialogC2306b.this.m7965p();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
            boolean z;
            C2319g.h.a aVarM8354h;
            if (hVar != DialogC2306b.this.f9017d || hVar.m8353g() == null) {
                z = false;
            } else {
                for (C2319g.h hVar2 : hVar.m8363q().m8332f()) {
                    if (!DialogC2306b.this.f9017d.m8358l().contains(hVar2) && (aVarM8354h = DialogC2306b.this.f9017d.m8354h(hVar2)) != null && aVarM8354h.m8374b() && !DialogC2306b.this.f9019f.contains(hVar2)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (!z) {
                DialogC2306b.this.m7965p();
            } else {
                DialogC2306b.this.m7966q();
                DialogC2306b.this.m7964o();
            }
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
            DialogC2306b.this.m7965p();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteSelected(C2319g c2319g, C2319g.h hVar) {
            DialogC2306b dialogC2306b = DialogC2306b.this;
            dialogC2306b.f9017d = hVar;
            dialogC2306b.h0 = false;
            dialogC2306b.m7966q();
            DialogC2306b.this.m7964o();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteUnselected(C2319g c2319g, C2319g.h hVar) {
            DialogC2306b.this.m7965p();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteVolumeChanged(C2319g c2319g, C2319g.h hVar) {
            f fVar;
            int iM8365s = hVar.m8365s();
            if (DialogC2306b.D0) {
                StringBuilder sb = new StringBuilder();
                sb.append("onRouteVolumeChanged(), route.getVolume:");
                sb.append(iM8365s);
            }
            DialogC2306b dialogC2306b = DialogC2306b.this;
            if (dialogC2306b.f9012Y == hVar || (fVar = (f) dialogC2306b.f9011X.get(hVar.m8357k())) == null) {
                return;
            }
            fVar.m7975R();
        }
    }

    /* renamed from: androidx.mediarouter.app.b$h */
    public final class h extends RecyclerView.AbstractC2371h {

        /* renamed from: b */
        public final LayoutInflater f9041b;

        /* renamed from: c */
        public final Drawable f9042c;

        /* renamed from: d */
        public final Drawable f9043d;

        /* renamed from: e */
        public final Drawable f9044e;

        /* renamed from: f */
        public final Drawable f9045f;

        /* renamed from: g */
        public f f9046g;

        /* renamed from: h */
        public final int f9047h;

        /* renamed from: a */
        public final ArrayList f9040a = new ArrayList();

        /* renamed from: i */
        public final Interpolator f9048i = new AccelerateDecelerateInterpolator();

        /* renamed from: androidx.mediarouter.app.b$h$a */
        public class a extends Animation {

            /* renamed from: a */
            public final /* synthetic */ int f9050a;

            /* renamed from: b */
            public final /* synthetic */ int f9051b;

            /* renamed from: c */
            public final /* synthetic */ View f9052c;

            public a(int i, int i2, View view) {
                this.f9050a = i;
                this.f9051b = i2;
                this.f9052c = view;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                int i = this.f9050a;
                DialogC2306b.m7957k(this.f9052c, this.f9051b + ((int) ((i - r0) * f)));
            }
        }

        /* renamed from: androidx.mediarouter.app.b$h$b */
        public class b implements Animation.AnimationListener {
            public b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DialogC2306b dialogC2306b = DialogC2306b.this;
                dialogC2306b.i0 = false;
                dialogC2306b.m7966q();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                DialogC2306b.this.i0 = true;
            }
        }

        /* renamed from: androidx.mediarouter.app.b$h$c */
        public class c extends RecyclerView.d0 {

            /* renamed from: u */
            public final View f9056u;

            /* renamed from: v */
            public final ImageView f9057v;

            /* renamed from: w */
            public final ProgressBar f9058w;

            /* renamed from: x */
            public final TextView f9059x;

            /* renamed from: y */
            public final float f9060y;

            /* renamed from: z */
            public C2319g.h f9061z;

            /* renamed from: androidx.mediarouter.app.b$h$c$a */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    c cVar = c.this;
                    DialogC2306b.this.f9014a.m8255y(cVar.f9061z);
                    c.this.f9057v.setVisibility(4);
                    c.this.f9058w.setVisibility(0);
                }
            }

            public c(View view) {
                super(view);
                this.f9056u = view;
                this.f9057v = (ImageView) view.findViewById(b8e.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(b8e.mr_cast_group_progress_bar);
                this.f9058w = progressBar;
                this.f9059x = (TextView) view.findViewById(b8e.mr_cast_group_name);
                this.f9060y = AbstractC2307c.m8003h(DialogC2306b.this.f9022q);
                AbstractC2307c.m8015t(DialogC2306b.this.f9022q, progressBar);
            }

            /* renamed from: O */
            public void m7984O(f fVar) {
                C2319g.h hVar = (C2319g.h) fVar.m7989a();
                this.f9061z = hVar;
                this.f9057v.setVisibility(0);
                this.f9058w.setVisibility(4);
                this.f9056u.setAlpha(m7985P(hVar) ? 1.0f : this.f9060y);
                this.f9056u.setOnClickListener(new a());
                this.f9057v.setImageDrawable(h.this.m7978f(hVar));
                this.f9059x.setText(hVar.m8359m());
            }

            /* renamed from: P */
            public final boolean m7985P(C2319g.h hVar) {
                List listM8358l = DialogC2306b.this.f9017d.m8358l();
                return (listM8358l.size() == 1 && listM8358l.get(0) == hVar) ? false : true;
            }
        }

        /* renamed from: androidx.mediarouter.app.b$h$d */
        public class d extends f {

            /* renamed from: y */
            public final TextView f9064y;

            /* renamed from: z */
            public final int f9065z;

            public d(View view) throws Resources.NotFoundException {
                super(view, (ImageButton) view.findViewById(b8e.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(b8e.mr_cast_volume_slider));
                this.f9064y = (TextView) view.findViewById(b8e.mr_group_volume_route_name);
                Resources resources = DialogC2306b.this.f9022q.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(h7e.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.f9065z = (int) typedValue.getDimension(displayMetrics);
            }

            /* renamed from: S */
            public void m7986S(f fVar) {
                DialogC2306b.m7957k(this.f9794a, h.this.m7980h() ? this.f9065z : 0);
                C2319g.h hVar = (C2319g.h) fVar.m7989a();
                super.m7972O(hVar);
                this.f9064y.setText(hVar.m8359m());
            }

            /* renamed from: T */
            public int m7987T() {
                return this.f9065z;
            }
        }

        /* renamed from: androidx.mediarouter.app.b$h$e */
        public class e extends RecyclerView.d0 {

            /* renamed from: u */
            public final TextView f9066u;

            public e(View view) {
                super(view);
                this.f9066u = (TextView) view.findViewById(b8e.mr_cast_header_name);
            }

            /* renamed from: O */
            public void m7988O(f fVar) {
                this.f9066u.setText(fVar.m7989a().toString());
            }
        }

        /* renamed from: androidx.mediarouter.app.b$h$f */
        public class f {

            /* renamed from: a */
            public final Object f9068a;

            /* renamed from: b */
            public final int f9069b;

            public f(Object obj, int i) {
                this.f9068a = obj;
                this.f9069b = i;
            }

            /* renamed from: a */
            public Object m7989a() {
                return this.f9068a;
            }

            /* renamed from: b */
            public int m7990b() {
                return this.f9069b;
            }
        }

        /* renamed from: androidx.mediarouter.app.b$h$g */
        public class g extends f {

            /* renamed from: A */
            public final ProgressBar f9071A;

            /* renamed from: B */
            public final TextView f9072B;

            /* renamed from: C */
            public final RelativeLayout f9073C;

            /* renamed from: D */
            public final CheckBox f9074D;

            /* renamed from: E */
            public final float f9075E;

            /* renamed from: F */
            public final int f9076F;

            /* renamed from: G */
            public final int f9077G;

            /* renamed from: H */
            public final View.OnClickListener f9078H;

            /* renamed from: y */
            public final View f9080y;

            /* renamed from: z */
            public final ImageView f9081z;

            /* renamed from: androidx.mediarouter.app.b$h$g$a */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    g gVar = g.this;
                    boolean z = !gVar.m7993U(gVar.f9034u);
                    boolean zM8371y = g.this.f9034u.m8371y();
                    if (z) {
                        g gVar2 = g.this;
                        DialogC2306b.this.f9014a.m8240c(gVar2.f9034u);
                    } else {
                        g gVar3 = g.this;
                        DialogC2306b.this.f9014a.m8250t(gVar3.f9034u);
                    }
                    g.this.m7994V(z, !zM8371y);
                    if (zM8371y) {
                        List listM8358l = DialogC2306b.this.f9017d.m8358l();
                        for (C2319g.h hVar : g.this.f9034u.m8358l()) {
                            if (listM8358l.contains(hVar) != z) {
                                f fVar = (f) DialogC2306b.this.f9011X.get(hVar.m8357k());
                                if (fVar instanceof g) {
                                    ((g) fVar).m7994V(z, true);
                                }
                            }
                        }
                    }
                    g gVar4 = g.this;
                    h.this.m7981i(gVar4.f9034u, z);
                }
            }

            public g(View view) throws Resources.NotFoundException {
                super(view, (ImageButton) view.findViewById(b8e.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(b8e.mr_cast_volume_slider));
                this.f9078H = new a();
                this.f9080y = view;
                this.f9081z = (ImageView) view.findViewById(b8e.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(b8e.mr_cast_route_progress_bar);
                this.f9071A = progressBar;
                this.f9072B = (TextView) view.findViewById(b8e.mr_cast_route_name);
                this.f9073C = (RelativeLayout) view.findViewById(b8e.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(b8e.mr_cast_checkbox);
                this.f9074D = checkBox;
                checkBox.setButtonDrawable(AbstractC2307c.m8000e(DialogC2306b.this.f9022q));
                AbstractC2307c.m8015t(DialogC2306b.this.f9022q, progressBar);
                this.f9075E = AbstractC2307c.m8003h(DialogC2306b.this.f9022q);
                Resources resources = DialogC2306b.this.f9022q.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(h7e.mr_dynamic_dialog_row_height, typedValue, true);
                this.f9076F = (int) typedValue.getDimension(displayMetrics);
                this.f9077G = 0;
            }

            /* renamed from: S */
            public void m7991S(f fVar) {
                C2319g.h hVar = (C2319g.h) fVar.m7989a();
                if (hVar == DialogC2306b.this.f9017d && hVar.m8358l().size() > 0) {
                    Iterator it = hVar.m8358l().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2319g.h hVar2 = (C2319g.h) it.next();
                        if (!DialogC2306b.this.f9019f.contains(hVar2)) {
                            hVar = hVar2;
                            break;
                        }
                    }
                }
                m7972O(hVar);
                this.f9081z.setImageDrawable(h.this.m7978f(hVar));
                this.f9072B.setText(hVar.m8359m());
                this.f9074D.setVisibility(0);
                boolean zM7993U = m7993U(hVar);
                boolean zM7992T = m7992T(hVar);
                this.f9074D.setChecked(zM7993U);
                this.f9071A.setVisibility(4);
                this.f9081z.setVisibility(0);
                this.f9080y.setEnabled(zM7992T);
                this.f9074D.setEnabled(zM7992T);
                this.f9035v.setEnabled(zM7992T || zM7993U);
                this.f9036w.setEnabled(zM7992T || zM7993U);
                this.f9080y.setOnClickListener(this.f9078H);
                this.f9074D.setOnClickListener(this.f9078H);
                DialogC2306b.m7957k(this.f9073C, (!zM7993U || this.f9034u.m8371y()) ? this.f9077G : this.f9076F);
                float f = 1.0f;
                this.f9080y.setAlpha((zM7992T || zM7993U) ? 1.0f : this.f9075E);
                CheckBox checkBox = this.f9074D;
                if (!zM7992T && zM7993U) {
                    f = this.f9075E;
                }
                checkBox.setAlpha(f);
            }

            /* renamed from: T */
            public final boolean m7992T(C2319g.h hVar) {
                if (DialogC2306b.this.f9021h.contains(hVar)) {
                    return false;
                }
                if (m7993U(hVar) && DialogC2306b.this.f9017d.m8358l().size() < 2) {
                    return false;
                }
                if (!m7993U(hVar)) {
                    return true;
                }
                C2319g.h.a aVarM8354h = DialogC2306b.this.f9017d.m8354h(hVar);
                return aVarM8354h != null && aVarM8354h.m8376d();
            }

            /* renamed from: U */
            public boolean m7993U(C2319g.h hVar) {
                if (hVar.m8338C()) {
                    return true;
                }
                C2319g.h.a aVarM8354h = DialogC2306b.this.f9017d.m8354h(hVar);
                return aVarM8354h != null && aVarM8354h.m8373a() == 3;
            }

            /* renamed from: V */
            public void m7994V(boolean z, boolean z2) {
                this.f9074D.setEnabled(false);
                this.f9080y.setEnabled(false);
                this.f9074D.setChecked(z);
                if (z) {
                    this.f9081z.setVisibility(4);
                    this.f9071A.setVisibility(0);
                }
                if (z2) {
                    h.this.m7976d(this.f9073C, z ? this.f9076F : this.f9077G);
                }
            }
        }

        public h() {
            this.f9041b = LayoutInflater.from(DialogC2306b.this.f9022q);
            this.f9042c = AbstractC2307c.m8002g(DialogC2306b.this.f9022q);
            this.f9043d = AbstractC2307c.m8012q(DialogC2306b.this.f9022q);
            this.f9044e = AbstractC2307c.m8008m(DialogC2306b.this.f9022q);
            this.f9045f = AbstractC2307c.m8009n(DialogC2306b.this.f9022q);
            this.f9047h = DialogC2306b.this.f9022q.getResources().getInteger(a9e.mr_cast_volume_slider_layout_animation_duration_ms);
            m7983k();
        }

        /* renamed from: d */
        public void m7976d(View view, int i) {
            a aVar = new a(i, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration(this.f9047h);
            aVar.setInterpolator(this.f9048i);
            view.startAnimation(aVar);
        }

        /* renamed from: e */
        public final Drawable m7977e(C2319g.h hVar) {
            int iM8352f = hVar.m8352f();
            return iM8352f != 1 ? iM8352f != 2 ? hVar.m8371y() ? this.f9045f : this.f9042c : this.f9044e : this.f9043d;
        }

        /* renamed from: f */
        public Drawable m7978f(C2319g.h hVar) {
            Uri uriM8356j = hVar.m8356j();
            if (uriM8356j != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(DialogC2306b.this.f9022q.getContentResolver().openInputStream(uriM8356j), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load ");
                    sb.append(uriM8356j);
                }
            }
            return m7977e(hVar);
        }

        /* renamed from: g */
        public f m7979g(int i) {
            return i == 0 ? this.f9046g : (f) this.f9040a.get(i - 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f9040a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemViewType(int i) {
            return m7979g(i).m7990b();
        }

        /* renamed from: h */
        public boolean m7980h() {
            DialogC2306b dialogC2306b = DialogC2306b.this;
            return dialogC2306b.C0 && dialogC2306b.f9017d.m8358l().size() > 1;
        }

        /* renamed from: i */
        public void m7981i(C2319g.h hVar, boolean z) {
            List listM8358l = DialogC2306b.this.f9017d.m8358l();
            int iMax = Math.max(1, listM8358l.size());
            if (hVar.m8371y()) {
                Iterator it = hVar.m8358l().iterator();
                while (it.hasNext()) {
                    if (listM8358l.contains((C2319g.h) it.next()) != z) {
                        iMax += z ? 1 : -1;
                    }
                }
            } else {
                iMax += z ? 1 : -1;
            }
            boolean zM7980h = m7980h();
            DialogC2306b dialogC2306b = DialogC2306b.this;
            boolean z2 = dialogC2306b.C0 && iMax >= 2;
            if (zM7980h != z2) {
                RecyclerView.d0 d0VarC0 = dialogC2306b.f9008L.c0(0);
                if (d0VarC0 instanceof d) {
                    d dVar = (d) d0VarC0;
                    m7976d(dVar.f9794a, z2 ? dVar.m7987T() : 0);
                }
            }
        }

        /* renamed from: j */
        public void m7982j() {
            DialogC2306b.this.f9021h.clear();
            DialogC2306b dialogC2306b = DialogC2306b.this;
            dialogC2306b.f9021h.addAll(d7b.m22456g(dialogC2306b.f9019f, dialogC2306b.m7959h()));
            notifyDataSetChanged();
        }

        /* renamed from: k */
        public void m7983k() {
            this.f9040a.clear();
            this.f9046g = new f(DialogC2306b.this.f9017d, 1);
            if (DialogC2306b.this.f9018e.isEmpty()) {
                this.f9040a.add(new f(DialogC2306b.this.f9017d, 3));
            } else {
                Iterator it = DialogC2306b.this.f9018e.iterator();
                while (it.hasNext()) {
                    this.f9040a.add(new f((C2319g.h) it.next(), 3));
                }
            }
            boolean z = false;
            if (!DialogC2306b.this.f9019f.isEmpty()) {
                boolean z2 = false;
                for (C2319g.h hVar : DialogC2306b.this.f9019f) {
                    if (!DialogC2306b.this.f9018e.contains(hVar)) {
                        if (!z2) {
                            AbstractC2316d.b bVarM8353g = DialogC2306b.this.f9017d.m8353g();
                            String strMo8190k = bVarM8353g != null ? bVarM8353g.mo8190k() : null;
                            if (TextUtils.isEmpty(strMo8190k)) {
                                strMo8190k = DialogC2306b.this.f9022q.getString(bae.mr_dialog_groupable_header);
                            }
                            this.f9040a.add(new f(strMo8190k, 2));
                            z2 = true;
                        }
                        this.f9040a.add(new f(hVar, 3));
                    }
                }
            }
            if (!DialogC2306b.this.f9020g.isEmpty()) {
                for (C2319g.h hVar2 : DialogC2306b.this.f9020g) {
                    C2319g.h hVar3 = DialogC2306b.this.f9017d;
                    if (hVar3 != hVar2) {
                        if (!z) {
                            AbstractC2316d.b bVarM8353g2 = hVar3.m8353g();
                            String strMo8191l = bVarM8353g2 != null ? bVarM8353g2.mo8191l() : null;
                            if (TextUtils.isEmpty(strMo8191l)) {
                                strMo8191l = DialogC2306b.this.f9022q.getString(bae.mr_dialog_transferable_header);
                            }
                            this.f9040a.add(new f(strMo8191l, 2));
                            z = true;
                        }
                        this.f9040a.add(new f(hVar2, 4));
                    }
                }
            }
            m7982j();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            int itemViewType = getItemViewType(i);
            f fVarM7979g = m7979g(i);
            if (itemViewType == 1) {
                DialogC2306b.this.f9011X.put(((C2319g.h) fVarM7979g.m7989a()).m8357k(), (f) d0Var);
                ((d) d0Var).m7986S(fVarM7979g);
            } else {
                if (itemViewType == 2) {
                    ((e) d0Var).m7988O(fVarM7979g);
                    return;
                }
                if (itemViewType != 3) {
                    if (itemViewType != 4) {
                        return;
                    }
                    ((c) d0Var).m7984O(fVarM7979g);
                } else {
                    DialogC2306b.this.f9011X.put(((C2319g.h) fVarM7979g.m7989a()).m8357k(), (f) d0Var);
                    ((g) d0Var).m7991S(fVarM7979g);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new d(this.f9041b.inflate(i9e.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new e(this.f9041b.inflate(i9e.mr_cast_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new g(this.f9041b.inflate(i9e.mr_cast_route_item, viewGroup, false));
            }
            if (i != 4) {
                return null;
            }
            return new c(this.f9041b.inflate(i9e.mr_cast_group_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public void onViewRecycled(RecyclerView.d0 d0Var) {
            super.onViewRecycled(d0Var);
            DialogC2306b.this.f9011X.values().remove(d0Var);
        }
    }

    /* renamed from: androidx.mediarouter.app.b$i */
    public static final class i implements Comparator {

        /* renamed from: a */
        public static final i f9083a = new i();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2319g.h hVar, C2319g.h hVar2) {
            return hVar.m8359m().compareToIgnoreCase(hVar2.m8359m());
        }
    }

    /* renamed from: androidx.mediarouter.app.b$j */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C2319g.h hVar = (C2319g.h) seekBar.getTag();
                f fVar = (f) DialogC2306b.this.f9011X.get(hVar.m8357k());
                if (fVar != null) {
                    fVar.m7974Q(i == 0);
                }
                hVar.m8341G(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            DialogC2306b dialogC2306b = DialogC2306b.this;
            if (dialogC2306b.f9012Y != null) {
                dialogC2306b.f9007H.removeMessages(2);
            }
            DialogC2306b.this.f9012Y = (C2319g.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            DialogC2306b.this.f9007H.sendEmptyMessageDelayed(2, 500L);
        }
    }

    public DialogC2306b(Context context) {
        this(context, 0);
    }

    /* renamed from: f */
    public static Bitmap m7955f(Bitmap bitmap, float f2, Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        scriptIntrinsicBlurCreate.setRadius(f2);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        allocationCreateTyped.copyTo(bitmapCopy);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
        scriptIntrinsicBlurCreate.destroy();
        renderScriptCreate.destroy();
        return bitmapCopy;
    }

    /* renamed from: i */
    public static boolean m7956i(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* renamed from: k */
    public static void m7957k(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    public void m7958g() {
        this.z0 = false;
        this.A0 = null;
        this.B0 = 0;
    }

    /* renamed from: h */
    public List m7959h() {
        ArrayList arrayList = new ArrayList();
        for (C2319g.h hVar : this.f9017d.m8363q().m8332f()) {
            C2319g.h.a aVarM8354h = this.f9017d.m8354h(hVar);
            if (aVarM8354h != null && aVarM8354h.m8374b()) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m7960j() {
        MediaDescriptionCompat mediaDescriptionCompat = this.v0;
        Bitmap bitmapM3452b = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.m3452b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.v0;
        Uri uriM3453c = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.m3453c() : null;
        d dVar = this.w0;
        Bitmap bitmapM7968b = dVar == null ? this.x0 : dVar.m7968b();
        d dVar2 = this.w0;
        Uri uriM7969c = dVar2 == null ? this.y0 : dVar2.m7969c();
        if (bitmapM7968b != bitmapM3452b || (bitmapM7968b == null && !s6c.m47909a(uriM7969c, uriM3453c))) {
            d dVar3 = this.w0;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            d dVar4 = new d();
            this.w0 = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    /* renamed from: l */
    public final void m7961l(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.t0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.m3526h(this.u0);
            this.t0 = null;
        }
        if (token != null && this.f9024x) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f9022q, token);
            this.t0 = mediaControllerCompat2;
            mediaControllerCompat2.m3524f(this.u0);
            MediaMetadataCompat mediaMetadataCompatM3520b = this.t0.m3520b();
            this.v0 = mediaMetadataCompatM3520b != null ? mediaMetadataCompatM3520b.m3489d() : null;
            m7960j();
            m7963n();
        }
    }

    /* renamed from: m */
    public final boolean m7962m() {
        if (this.f9012Y != null || this.h0 || this.i0) {
            return true;
        }
        return !this.f9023s;
    }

    /* renamed from: n */
    public void m7963n() {
        if (m7962m()) {
            this.k0 = true;
            return;
        }
        this.k0 = false;
        if (!this.f9017d.m8338C() || this.f9017d.m8369w()) {
            dismiss();
        }
        if (!this.z0 || m7956i(this.A0) || this.A0 == null) {
            if (m7956i(this.A0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't set artwork image with recycled bitmap: ");
                sb.append(this.A0);
            }
            this.p0.setVisibility(8);
            this.o0.setVisibility(8);
            this.n0.setImageBitmap(null);
        } else {
            this.p0.setVisibility(0);
            this.p0.setImageBitmap(this.A0);
            this.p0.setBackgroundColor(this.B0);
            this.o0.setVisibility(0);
            this.n0.setImageBitmap(m7955f(this.A0, 10.0f, this.f9022q));
        }
        m7958g();
        MediaDescriptionCompat mediaDescriptionCompat = this.v0;
        CharSequence charSequenceM3456f = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.m3456f();
        boolean z = !TextUtils.isEmpty(charSequenceM3456f);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.v0;
        CharSequence charSequenceM3455e = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.m3455e() : null;
        boolean zIsEmpty = true ^ TextUtils.isEmpty(charSequenceM3455e);
        if (z) {
            this.q0.setText(charSequenceM3456f);
        } else {
            this.q0.setText(this.s0);
        }
        if (!zIsEmpty) {
            this.r0.setVisibility(8);
        } else {
            this.r0.setText(charSequenceM3455e);
            this.r0.setVisibility(0);
        }
    }

    /* renamed from: o */
    public void m7964o() {
        this.f9018e.clear();
        this.f9019f.clear();
        this.f9020g.clear();
        this.f9018e.addAll(this.f9017d.m8358l());
        for (C2319g.h hVar : this.f9017d.m8363q().m8332f()) {
            C2319g.h.a aVarM8354h = this.f9017d.m8354h(hVar);
            if (aVarM8354h != null) {
                if (aVarM8354h.m8374b()) {
                    this.f9019f.add(hVar);
                }
                if (aVarM8354h.m8375c()) {
                    this.f9020g.add(hVar);
                }
            }
        }
        onFilterRoutes(this.f9019f);
        onFilterRoutes(this.f9020g);
        List list = this.f9018e;
        i iVar = i.f9083a;
        Collections.sort(list, iVar);
        Collections.sort(this.f9019f, iVar);
        Collections.sort(this.f9020g, iVar);
        this.f9009M.m7983k();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9024x = true;
        this.f9014a.m8239b(this.f9016c, this.f9015b, 1);
        m7964o();
        m7961l(this.f9014a.m8244k());
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i9e.mr_cast_dialog);
        AbstractC2307c.m8014s(this.f9022q, this);
        ImageButton imageButton = (ImageButton) findViewById(b8e.mr_cast_close_button);
        this.l0 = imageButton;
        imageButton.setColorFilter(-1);
        this.l0.setOnClickListener(new b());
        Button button = (Button) findViewById(b8e.mr_cast_stop_button);
        this.m0 = button;
        button.setTextColor(-1);
        this.m0.setOnClickListener(new c());
        this.f9009M = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(b8e.mr_cast_list);
        this.f9008L = recyclerView;
        recyclerView.setAdapter(this.f9009M);
        this.f9008L.setLayoutManager(new LinearLayoutManager(this.f9022q));
        this.f9010Q = new j();
        this.f9011X = new HashMap();
        this.f9013Z = new HashMap();
        this.n0 = (ImageView) findViewById(b8e.mr_cast_meta_background);
        this.o0 = findViewById(b8e.mr_cast_meta_black_scrim);
        this.p0 = (ImageView) findViewById(b8e.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(b8e.mr_cast_meta_title);
        this.q0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(b8e.mr_cast_meta_subtitle);
        this.r0 = textView2;
        textView2.setTextColor(-1);
        this.s0 = this.f9022q.getResources().getString(bae.mr_cast_dialog_title_view_placeholder);
        this.f9023s = true;
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9024x = false;
        this.f9014a.m8249s(this.f9015b);
        this.f9007H.removeCallbacksAndMessages(null);
        m7961l(null);
    }

    public boolean onFilterRoute(C2319g.h hVar) {
        return !hVar.m8369w() && hVar.m8370x() && hVar.m8339E(this.f9016c) && this.f9017d != hVar;
    }

    public void onFilterRoutes(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!onFilterRoute((C2319g.h) list.get(size))) {
                list.remove(size);
            }
        }
    }

    /* renamed from: p */
    public void m7965p() {
        if (this.f9024x) {
            if (SystemClock.uptimeMillis() - this.f9025y < 300) {
                this.f9007H.removeMessages(1);
                this.f9007H.sendEmptyMessageAtTime(1, this.f9025y + 300);
            } else {
                if (m7962m()) {
                    this.j0 = true;
                    return;
                }
                this.j0 = false;
                if (!this.f9017d.m8338C() || this.f9017d.m8369w()) {
                    dismiss();
                }
                this.f9025y = SystemClock.uptimeMillis();
                this.f9009M.m7982j();
            }
        }
    }

    /* renamed from: q */
    public void m7966q() {
        if (this.j0) {
            m7965p();
        }
        if (this.k0) {
            m7963n();
        }
    }

    public void setRouteSelector(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f9016c.equals(c2318f)) {
            return;
        }
        this.f9016c = c2318f;
        if (this.f9024x) {
            this.f9014a.m8249s(this.f9015b);
            this.f9014a.m8239b(c2318f, this.f9015b, 1);
            m7964o();
        }
    }

    public void updateLayout() {
        getWindow().setLayout(d7b.m22452c(this.f9022q), d7b.m22450a(this.f9022q));
        this.x0 = null;
        this.y0 = null;
        m7960j();
        m7963n();
        m7965p();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC2306b(Context context, int i2) {
        Context contextM7997b = AbstractC2307c.m7997b(context, i2, false);
        super(contextM7997b, AbstractC2307c.m7998c(contextM7997b));
        this.f9016c = C2318f.f9224c;
        this.f9018e = new ArrayList();
        this.f9019f = new ArrayList();
        this.f9020g = new ArrayList();
        this.f9021h = new ArrayList();
        this.f9007H = new a();
        Context context2 = getContext();
        this.f9022q = context2;
        C2319g c2319gM8234j = C2319g.m8234j(context2);
        this.f9014a = c2319gM8234j;
        this.C0 = C2319g.m8235o();
        this.f9015b = new g();
        this.f9017d = c2319gM8234j.m8247n();
        this.u0 = new e();
        m7961l(c2319gM8234j.m8244k());
    }
}
