package ai.salesmax;

import ai.salesmax.RecordingDialogFragment;
import ai.salesmax.model.Leads;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.InterfaceC2137f;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.google.android.material.textview.MaterialTextView;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import p001o.afe;
import p001o.c64;
import p001o.ecc;
import p001o.h8g;
import p001o.id5;
import p001o.je5;
import p001o.jnd;
import p001o.ns;
import p001o.s2b;
import p001o.sq8;
import p001o.ss;
import p001o.ws;
import p001o.wx0;
import p001o.xh7;
import p001o.zee;

/* loaded from: classes.dex */
public final class RecordingDialogFragment extends DialogFragment {

    /* renamed from: M */
    public static final C0032a f181M = new C0032a(null);

    /* renamed from: Q */
    public static final int f182Q = 8;

    /* renamed from: L */
    public final ws f184L;

    /* renamed from: a */
    public xh7 f185a;

    /* renamed from: b */
    public MediaRecorder f186b;

    /* renamed from: c */
    public String f187c;

    /* renamed from: d */
    public int f188d;

    /* renamed from: f */
    public boolean f190f;

    /* renamed from: g */
    public ecc f191g;

    /* renamed from: q */
    public int f193q;

    /* renamed from: x */
    public ExoPlayer f195x;

    /* renamed from: y */
    public Leads f196y;

    /* renamed from: e */
    public final int f189e = 200;

    /* renamed from: h */
    public Handler f192h = new Handler(Looper.getMainLooper());

    /* renamed from: s */
    public String f194s = "";

    /* renamed from: H */
    public String f183H = "VOICE_NOTE";

    /* renamed from: ai.salesmax.RecordingDialogFragment$a */
    public static final class C0032a {
        public C0032a() {
        }

        public /* synthetic */ C0032a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ RecordingDialogFragment m76b(C0032a c0032a, Leads leads, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "VOICE_NOTE";
            }
            return c0032a.m77a(leads, str);
        }

        /* renamed from: a */
        public final RecordingDialogFragment m77a(Leads leads, String str) {
            sq8.m48649h(str, "viewType");
            RecordingDialogFragment recordingDialogFragment = new RecordingDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("LEAD_ARGUMENT", leads);
            bundle.putString("viewType", str);
            recordingDialogFragment.setArguments(bundle);
            return recordingDialogFragment;
        }
    }

    /* renamed from: ai.salesmax.RecordingDialogFragment$b */
    public static final class RunnableC0033b implements Runnable {
        public RunnableC0033b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RecordingDialogFragment.this.f190f) {
                RecordingDialogFragment.this.f193q++;
                int i = RecordingDialogFragment.this.f193q / 60;
                int i2 = RecordingDialogFragment.this.f193q % 60;
                MaterialTextView materialTextView = RecordingDialogFragment.this.T0().t0;
                h8g h8gVar = h8g.f26398a;
                String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
                sq8.m48648g(str, "format(...)");
                materialTextView.setText(str);
                if (RecordingDialogFragment.this.f193q >= 60) {
                    RecordingDialogFragment.this.j1();
                } else {
                    RecordingDialogFragment.this.f192h.postDelayed(this, 1000L);
                }
            }
        }
    }

    public RecordingDialogFragment() {
        ws wsVarRegisterForActivityResult = registerForActivityResult(new ss(), new ns() { // from class: o.cfe
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) throws IllegalStateException, IOException {
                RecordingDialogFragment.d1(this.f18036a, (Map) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f184L = wsVarRegisterForActivityResult;
    }

    public static final void U0(RecordingDialogFragment recordingDialogFragment, View view) {
        sq8.m48649h(recordingDialogFragment, "this$0");
        recordingDialogFragment.j1();
    }

    public static final void V0(RecordingDialogFragment recordingDialogFragment, View view) throws IllegalStateException, IOException {
        sq8.m48649h(recordingDialogFragment, "this$0");
        recordingDialogFragment.e1();
    }

    public static final void W0(RecordingDialogFragment recordingDialogFragment, View view) {
        sq8.m48649h(recordingDialogFragment, "this$0");
        g1(recordingDialogFragment, false, 1, null);
    }

    public static final void X0(RecordingDialogFragment recordingDialogFragment, View view) {
        sq8.m48649h(recordingDialogFragment, "this$0");
        recordingDialogFragment.f1(true);
    }

    public static final void c1(RecordingDialogFragment recordingDialogFragment) throws IllegalStateException, IOException {
        sq8.m48649h(recordingDialogFragment, "this$0");
        recordingDialogFragment.a1();
    }

    public static final void d1(RecordingDialogFragment recordingDialogFragment, Map map) throws IllegalStateException, IOException {
        sq8.m48649h(recordingDialogFragment, "this$0");
        if (!sq8.m48644c(map.get("android.permission.RECORD_AUDIO"), Boolean.TRUE)) {
            Toast.makeText(recordingDialogFragment.requireContext(), "Permission to record audio denied", 0).show();
        } else {
            recordingDialogFragment.h1();
            recordingDialogFragment.i1();
        }
    }

    public static /* synthetic */ void g1(RecordingDialogFragment recordingDialogFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        recordingDialogFragment.f1(z);
    }

    public final xh7 T0() {
        xh7 xh7Var = this.f185a;
        sq8.m48646e(xh7Var);
        return xh7Var;
    }

    public final void Y0() {
        try {
            ExoPlayer exoPlayer = this.f195x;
            if (exoPlayer != null) {
                exoPlayer.a0(wx0.f52810g, true);
                s2b s2bVarM47470a = new s2b.C16718c().m47476g(this.f187c).m47470a();
                sq8.m48648g(s2bVarM47470a, "build(...)");
                jnd jndVarM34136g = new jnd.C14620b(new je5.C14508b()).mo6940e(s2bVarM47470a);
                sq8.m48648g(jndVarM34136g, "createMediaSource(...)");
                exoPlayer.mo6829q(jndVarM34136g);
                exoPlayer.mo31986n(s2bVarM47470a);
                exoPlayer.mo7137f();
            }
        } catch (Exception e) {
            e.toString();
            PlayerView playerView = T0().n0;
            sq8.m48648g(playerView, "mAudioPlayer");
            if (playerView.getVisibility() == 0) {
                T0().n0.setVisibility(8);
            }
        }
    }

    public final void Z0() {
        ExoPlayer exoPlayer = this.f195x;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.f195x = null;
    }

    public final void a1() throws IllegalStateException, IOException {
        if (getView() == null) {
            return;
        }
        if (c64.checkSelfPermission(requireContext(), "android.permission.RECORD_AUDIO") != 0) {
            this.f184L.m54945b(new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"});
        } else {
            h1();
            i1();
        }
    }

    public final void b1() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.bfe
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, IOException {
                RecordingDialogFragment.c1(this.f16097a);
            }
        }, 500L);
    }

    public final void e1() throws IllegalStateException, IOException {
        this.f187c = null;
        this.f188d = 0;
        T0().t0.setText("00:00");
        T0().w0.setVisibility(0);
        T0().s0.setVisibility(0);
        T0().q0.setVisibility(8);
        T0().n0.setVisibility(8);
        this.f193q = 0;
        h1();
        i1();
    }

    public final void f1(boolean z) {
        ecc eccVar;
        String str = this.f187c;
        if (str != null && (eccVar = this.f191g) != null) {
            sq8.m48646e(str);
            eccVar.mo946E(str, this.f194s, "audio/mp4", this.f196y, Boolean.valueOf(z));
        }
        dismiss();
    }

    public final void h1() throws IllegalStateException, IOException {
        this.f194s = System.currentTimeMillis() + "-audio_record.m4a";
        File externalCacheDir = requireContext().getExternalCacheDir();
        String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
        this.f187c = absolutePath + "/" + this.f194s;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                afe.m17010a();
                MediaRecorder mediaRecorderM59359a = zee.m59359a(requireContext());
                mediaRecorderM59359a.setAudioSource(1);
                mediaRecorderM59359a.setOutputFormat(2);
                mediaRecorderM59359a.setAudioEncoder(3);
                mediaRecorderM59359a.setAudioEncodingBitRate(128000);
                mediaRecorderM59359a.setAudioSamplingRate(16000);
                mediaRecorderM59359a.setOutputFile(this.f187c);
                try {
                    mediaRecorderM59359a.prepare();
                    mediaRecorderM59359a.start();
                    this.f190f = true;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (IllegalStateException e2) {
                    e2.printStackTrace();
                }
                this.f186b = mediaRecorderM59359a;
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                try {
                    afe.m17010a();
                    MediaRecorder mediaRecorderM59359a2 = zee.m59359a(requireContext());
                    mediaRecorderM59359a2.setAudioSource(1);
                    mediaRecorderM59359a2.setOutputFormat(2);
                    mediaRecorderM59359a2.setAudioEncoder(3);
                    mediaRecorderM59359a2.setAudioEncodingBitRate(128000);
                    mediaRecorderM59359a2.setAudioSamplingRate(16000);
                    mediaRecorderM59359a2.setOutputFile(this.f187c);
                    try {
                        mediaRecorderM59359a2.prepare();
                        mediaRecorderM59359a2.start();
                        this.f190f = true;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    } catch (IllegalStateException e5) {
                        e5.printStackTrace();
                    }
                    this.f186b = mediaRecorderM59359a2;
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        try {
            MediaRecorder mediaRecorder = new MediaRecorder();
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(2);
            mediaRecorder.setAudioEncoder(3);
            mediaRecorder.setAudioEncodingBitRate(128000);
            mediaRecorder.setAudioSamplingRate(16000);
            mediaRecorder.setOutputFile(this.f187c);
            try {
                mediaRecorder.prepare();
                mediaRecorder.start();
                this.f190f = true;
            } catch (IOException e6) {
                e6.printStackTrace();
            } catch (IllegalStateException e7) {
                e7.printStackTrace();
            }
            this.f186b = mediaRecorder;
        } catch (Exception e8) {
            e8.printStackTrace();
            try {
                MediaRecorder mediaRecorder2 = new MediaRecorder();
                mediaRecorder2.setAudioSource(1);
                mediaRecorder2.setOutputFormat(2);
                mediaRecorder2.setAudioEncoder(3);
                mediaRecorder2.setAudioEncodingBitRate(128000);
                mediaRecorder2.setAudioSamplingRate(16000);
                mediaRecorder2.setOutputFile(this.f187c);
                try {
                    mediaRecorder2.prepare();
                    mediaRecorder2.start();
                    this.f190f = true;
                } catch (IOException e9) {
                    e9.printStackTrace();
                } catch (IllegalStateException e10) {
                    e10.printStackTrace();
                }
                this.f186b = mediaRecorder2;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void i1() {
        this.f192h.postDelayed(new RunnableC0033b(), 1000L);
    }

    public final void j1() {
        try {
            MediaRecorder mediaRecorder = this.f186b;
            try {
                if (mediaRecorder != null) {
                    try {
                        mediaRecorder.stop();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    } catch (RuntimeException e2) {
                        e2.printStackTrace();
                    }
                }
                this.f186b = null;
                this.f190f = false;
                k1();
                T0().w0.setVisibility(8);
                T0().s0.setVisibility(8);
                T0().q0.setVisibility(0);
                T0().n0.setVisibility(0);
                if (this.f187c != null) {
                    Y0();
                }
            } finally {
                mediaRecorder.release();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void k1() {
        this.f192h.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        try {
            InterfaceC2137f parentFragment = getParentFragment();
            sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.OnRecordingSavedListener");
            this.f191g = (ecc) parentFragment;
        } catch (ClassCastException unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f196y = (Leads) arguments.getParcelable("LEAD_ARGUMENT");
            String string = arguments.getString("viewType");
            if (string == null) {
                string = "VOICE_NOTE";
            } else {
                sq8.m48646e(string);
            }
            this.f183H = string;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f185a == null) {
            xh7 xh7VarH0 = xh7.h0(layoutInflater, viewGroup, false);
            xh7VarH0.s0.setOnClickListener(new View.OnClickListener() { // from class: o.dfe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecordingDialogFragment.U0(this.f19743a, view);
                }
            });
            xh7VarH0.p0.setOnClickListener(new View.OnClickListener() { // from class: o.efe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalStateException, IOException {
                    RecordingDialogFragment.V0(this.f21578a, view);
                }
            });
            xh7VarH0.r0.setOnClickListener(new View.OnClickListener() { // from class: o.ffe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecordingDialogFragment.W0(this.f23238a, view);
                }
            });
            xh7VarH0.o0.setOnClickListener(new View.OnClickListener() { // from class: o.gfe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecordingDialogFragment.X0(this.f25077a, view);
                }
            });
            this.f185a = xh7VarH0;
        }
        ExoPlayer exoPlayerM6842f = new ExoPlayer.C2189b(requireContext()).m6843l(wx0.f52810g, true).m6842f();
        T0().n0.setPlayer(exoPlayerM6842f);
        this.f195x = exoPlayerM6842f;
        View viewM25689B = T0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MediaRecorder mediaRecorder = this.f186b;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        Z0();
        this.f192h.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        if (sq8.m48644c(this.f183H, "CHAT")) {
            T0().o0.setVisibility(8);
            T0().r0.setText("Send Voice Note");
        }
    }
}
