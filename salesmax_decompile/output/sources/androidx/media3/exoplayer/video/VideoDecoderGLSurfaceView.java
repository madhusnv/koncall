package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p001o.eui;
import p001o.fui;
import p001o.tq;
import p001o.us7;
import p001o.vs7;

/* loaded from: classes2.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements fui {

    /* renamed from: b */
    public static final /* synthetic */ int f8579b = 0;

    /* renamed from: a */
    public final C2230a f8580a;

    /* renamed from: androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView$a */
    public static final class C2230a implements GLSurfaceView.Renderer {

        /* renamed from: a */
        public final GLSurfaceView f8586a;

        /* renamed from: b */
        public final int[] f8587b = new int[3];

        /* renamed from: c */
        public final int[] f8588c = new int[3];

        /* renamed from: d */
        public final int[] f8589d = new int[3];

        /* renamed from: e */
        public final int[] f8590e = new int[3];

        /* renamed from: f */
        public final AtomicReference f8591f = new AtomicReference();

        /* renamed from: g */
        public final FloatBuffer[] f8592g = new FloatBuffer[3];

        /* renamed from: h */
        public us7 f8593h;

        /* renamed from: q */
        public int f8594q;

        /* renamed from: s */
        public static final float[] f8583s = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: x */
        public static final float[] f8584x = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: y */
        public static final float[] f8585y = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: H */
        public static final String[] f8581H = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: L */
        public static final FloatBuffer f8582L = vs7.m53372e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        public C2230a(GLSurfaceView gLSurfaceView) {
            this.f8586a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f8589d;
                this.f8590e[i] = -1;
                iArr[i] = -1;
            }
        }

        /* renamed from: a */
        public void m7512a(eui euiVar) {
            tq.m50332a(this.f8591f.getAndSet(euiVar));
            this.f8586a.requestRender();
        }

        /* renamed from: b */
        public final void m7513b() {
            try {
                GLES20.glGenTextures(3, this.f8587b, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f8593h.m52002j(f8581H[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    vs7.m53368a(3553, this.f8587b[i], 9729);
                }
                vs7.m53369b();
            } catch (vs7.C17668a unused) {
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            tq.m50332a(this.f8591f.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                us7 us7Var = new us7("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f8593h = us7Var;
                GLES20.glVertexAttribPointer(us7Var.m52000e("in_pos"), 2, 5126, false, 0, (Buffer) f8582L);
                this.f8588c[0] = this.f8593h.m52000e("in_tc_y");
                this.f8588c[1] = this.f8593h.m52000e("in_tc_u");
                this.f8588c[2] = this.f8593h.m52000e("in_tc_v");
                this.f8594q = this.f8593h.m52002j("mColorConversion");
                vs7.m53369b();
                m7513b();
                vs7.m53369b();
            } catch (vs7.C17668a unused) {
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public fui getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(eui euiVar) {
        this.f8580a.m7512a(euiVar);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2230a c2230a = new C2230a(this);
        this.f8580a = c2230a;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c2230a);
        setRenderMode(0);
    }
}
