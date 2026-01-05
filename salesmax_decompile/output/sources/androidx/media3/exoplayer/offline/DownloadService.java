package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;
import p001o.lx5;
import p001o.op0;
import p001o.p4c;
import p001o.ria;
import p001o.sqi;

/* loaded from: classes2.dex */
public abstract class DownloadService extends Service {

    /* renamed from: s */
    public static final HashMap f8501s = new HashMap();

    /* renamed from: a */
    public final String f8502a;

    /* renamed from: b */
    public final int f8503b;

    /* renamed from: c */
    public final int f8504c;

    /* renamed from: d */
    public C2220a f8505d;

    /* renamed from: e */
    public int f8506e;

    /* renamed from: f */
    public boolean f8507f;

    /* renamed from: g */
    public boolean f8508g;

    /* renamed from: h */
    public boolean f8509h;

    /* renamed from: q */
    public boolean f8510q;

    /* renamed from: androidx.media3.exoplayer.offline.DownloadService$a */
    public static final class C2220a {
        /* renamed from: a */
        public static /* synthetic */ lx5 m7435a(C2220a c2220a) {
            c2220a.getClass();
            return null;
        }

        /* renamed from: b */
        public abstract void m7436b(DownloadService downloadService);

        /* renamed from: c */
        public abstract void m7437c(DownloadService downloadService);
    }

    /* renamed from: a */
    public abstract lx5 m7434a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f8502a;
        if (str != null) {
            p4c.m42968a(this, str, this.f8503b, this.f8504c, 2);
        }
        C2220a c2220a = (C2220a) f8501s.get(getClass());
        if (c2220a != null) {
            this.f8505d = c2220a;
            c2220a.m7436b(this);
        } else {
            int i = sqi.f45790a;
            m7434a();
            throw null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f8510q = true;
        ((C2220a) op0.m42515e(this.f8505d)).m7437c(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        this.f8506e = i2;
        this.f8508g = false;
        char c = 1;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f8507f |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        C2220a.m7435a((C2220a) op0.m42515e(this.f8505d));
        switch (action.hashCode()) {
            case -2068303304:
                if (!action.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1192305801:
                if (!action.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                }
                break;
            case -659421309:
                if (action.equals("androidx.media3.exoplayer.downloadService.action.RESTART")) {
                    c = 2;
                    break;
                }
                break;
            case -238450692:
                if (action.equals("androidx.media3.exoplayer.downloadService.action.INIT")) {
                    c = 3;
                    break;
                }
                break;
            case 32678949:
                if (action.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    c = 4;
                    break;
                }
                break;
            case 464223742:
                if (action.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    c = 5;
                    break;
                }
                break;
            case 829812082:
                if (action.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    c = 6;
                    break;
                }
                break;
            case 845668953:
                if (action.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    c = 7;
                    break;
                }
                break;
            case 1746253622:
                if (action.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (!((Intent) op0.m42515e(intent)).hasExtra("stop_reason")) {
                    ria.m46819c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
            case 1:
                if (stringExtra != null) {
                    throw null;
                }
                ria.m46819c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
            case 2:
            case 3:
                break;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                if (((DownloadRequest) ((Intent) op0.m42515e(intent)).getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
                ria.m46819c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
            case 7:
                if (((Requirements) ((Intent) op0.m42515e(intent)).getParcelableExtra("requirements")) != null) {
                    throw null;
                }
                ria.m46819c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
            case '\b':
                throw null;
            default:
                ria.m46819c("DownloadService", "Ignored unrecognized action: " + action);
                break;
        }
        if (sqi.f45790a >= 26) {
            boolean z = this.f8507f;
        }
        this.f8509h = false;
        throw null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f8508g = true;
    }
}
