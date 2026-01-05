package p001o;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p001o.lnd;
import p001o.vs7;

/* loaded from: classes2.dex */
public final class nnd {

    /* renamed from: j */
    public static final float[] f37063j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k */
    public static final float[] f37064k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l */
    public static final float[] f37065l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    public static final float[] f37066m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n */
    public static final float[] f37067n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f37068a;

    /* renamed from: b */
    public C15615a f37069b;

    /* renamed from: c */
    public C15615a f37070c;

    /* renamed from: d */
    public us7 f37071d;

    /* renamed from: e */
    public int f37072e;

    /* renamed from: f */
    public int f37073f;

    /* renamed from: g */
    public int f37074g;

    /* renamed from: h */
    public int f37075h;

    /* renamed from: i */
    public int f37076i;

    /* renamed from: o.nnd$a */
    public static class C15615a {

        /* renamed from: a */
        public final int f37077a;

        /* renamed from: b */
        public final FloatBuffer f37078b;

        /* renamed from: c */
        public final FloatBuffer f37079c;

        /* renamed from: d */
        public final int f37080d;

        public C15615a(lnd.C15112b c15112b) {
            this.f37077a = c15112b.m37532a();
            this.f37078b = vs7.m53372e(c15112b.f34126c);
            this.f37079c = vs7.m53372e(c15112b.f34127d);
            int i = c15112b.f34125b;
            if (i == 1) {
                this.f37080d = 5;
            } else if (i != 2) {
                this.f37080d = 4;
            } else {
                this.f37080d = 6;
            }
        }
    }

    /* renamed from: c */
    public static boolean m40803c(lnd lndVar) {
        lnd.C15111a c15111a = lndVar.f34119a;
        lnd.C15111a c15111a2 = lndVar.f34120b;
        return c15111a.m37531b() == 1 && c15111a.m37530a(0).f34124a == 0 && c15111a2.m37531b() == 1 && c15111a2.m37530a(0).f34124a == 0;
    }

    /* renamed from: a */
    public void m40804a(int i, float[] fArr, boolean z) {
        C15615a c15615a = z ? this.f37070c : this.f37069b;
        if (c15615a == null) {
            return;
        }
        int i2 = this.f37068a;
        GLES20.glUniformMatrix3fv(this.f37073f, 1, false, i2 == 1 ? z ? f37065l : f37064k : i2 == 2 ? z ? f37067n : f37066m : f37063j, 0);
        GLES20.glUniformMatrix4fv(this.f37072e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f37076i, 0);
        try {
            vs7.m53369b();
        } catch (vs7.C17668a unused) {
        }
        GLES20.glVertexAttribPointer(this.f37074g, 3, 5126, false, 12, (Buffer) c15615a.f37078b);
        try {
            vs7.m53369b();
        } catch (vs7.C17668a unused2) {
        }
        GLES20.glVertexAttribPointer(this.f37075h, 2, 5126, false, 8, (Buffer) c15615a.f37079c);
        try {
            vs7.m53369b();
        } catch (vs7.C17668a unused3) {
        }
        GLES20.glDrawArrays(c15615a.f37080d, 0, c15615a.f37077a);
        try {
            vs7.m53369b();
        } catch (vs7.C17668a unused4) {
        }
    }

    /* renamed from: b */
    public void m40805b() {
        try {
            us7 us7Var = new us7("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f37071d = us7Var;
            this.f37072e = us7Var.m52002j("uMvpMatrix");
            this.f37073f = this.f37071d.m52002j("uTexMatrix");
            this.f37074g = this.f37071d.m52000e("aPosition");
            this.f37075h = this.f37071d.m52000e("aTexCoords");
            this.f37076i = this.f37071d.m52002j("uTexture");
        } catch (vs7.C17668a unused) {
        }
    }

    /* renamed from: d */
    public void m40806d(lnd lndVar) {
        if (m40803c(lndVar)) {
            this.f37068a = lndVar.f34121c;
            C15615a c15615a = new C15615a(lndVar.f34119a.m37530a(0));
            this.f37069b = c15615a;
            if (!lndVar.f34122d) {
                c15615a = new C15615a(lndVar.f34120b.m37530a(0));
            }
            this.f37070c = c15615a;
        }
    }
}
