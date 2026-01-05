package s0;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s0.g */
/* loaded from: classes.dex */
public abstract class AbstractC6703g {

    /* renamed from: a */
    public final int f32020a;

    /* renamed from: b */
    public int f32021b = -1;

    /* renamed from: c */
    public int f32022c = -1;

    /* renamed from: d */
    public int f32023d = -1;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC6703g(java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.f32021b = r2
            r7.f32022c = r2
            r7.f32023d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = s0.AbstractC6705i.m12841j(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L71
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = s0.AbstractC6705i.m12841j(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6b
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L65
            java.lang.String r4 = "glCreateProgram"
            s0.AbstractC6705i.m12833b(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            s0.AbstractC6705i.m12833b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            s0.AbstractC6705i.m12833b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0 = 1
            int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            if (r4 != r0) goto L4c
            r7.f32020a = r3     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r7.m12830a()
            return
        L48:
            r0 = move-exception
            goto L73
        L4a:
            r0 = move-exception
            goto L73
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
        L62:
            r0 = move-exception
        L63:
            r3 = r2
            goto L73
        L65:
            r0 = move-exception
            goto L63
        L67:
            r0 = move-exception
        L68:
            r9 = r2
        L69:
            r3 = r9
            goto L73
        L6b:
            r0 = move-exception
            goto L68
        L6d:
            r0 = move-exception
        L6e:
            r8 = r2
            r9 = r8
            goto L69
        L71:
            r0 = move-exception
            goto L6e
        L73:
            if (r8 == r2) goto L78
            android.opengl.GLES20.glDeleteShader(r8)
        L78:
            if (r9 == r2) goto L7d
            android.opengl.GLES20.glDeleteShader(r9)
        L7d:
            if (r3 == r2) goto L82
            android.opengl.GLES20.glDeleteProgram(r3)
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.AbstractC6703g.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void m12830a() {
        int i10 = this.f32020a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i10, "aPosition");
        this.f32023d = iGlGetAttribLocation;
        AbstractC6705i.m12836e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i10, "uTransMatrix");
        this.f32021b = iGlGetUniformLocation;
        AbstractC6705i.m12836e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i10, "uAlphaScale");
        this.f32022c = iGlGetUniformLocation2;
        AbstractC6705i.m12836e(iGlGetUniformLocation2, "uAlphaScale");
    }

    /* renamed from: b */
    public void mo12831b() {
        GLES20.glUseProgram(this.f32020a);
        AbstractC6705i.m12833b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f32023d);
        AbstractC6705i.m12833b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f32023d, 2, 5126, false, 0, (Buffer) AbstractC6705i.f32034h);
        AbstractC6705i.m12833b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f32021b, 1, false, fArr, 0);
        AbstractC6705i.m12833b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f32022c, 1.0f);
        AbstractC6705i.m12833b("glUniform1f");
    }
}
