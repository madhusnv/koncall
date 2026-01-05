package p001o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes3.dex */
public class tu7 extends oe1 {

    /* renamed from: A */
    public final gc1 f47883A;

    /* renamed from: B */
    public vri f47884B;

    /* renamed from: r */
    public final String f47885r;

    /* renamed from: s */
    public final boolean f47886s;

    /* renamed from: t */
    public final rla f47887t;

    /* renamed from: u */
    public final rla f47888u;

    /* renamed from: v */
    public final RectF f47889v;

    /* renamed from: w */
    public final vu7 f47890w;

    /* renamed from: x */
    public final int f47891x;

    /* renamed from: y */
    public final gc1 f47892y;

    /* renamed from: z */
    public final gc1 f47893z;

    public tu7(ema emaVar, hc1 hc1Var, su7 su7Var) {
        super(emaVar, hc1Var, su7Var.m48923b().toPaintCap(), su7Var.m48928g().toPaintJoin(), su7Var.m48930i(), su7Var.m48932k(), su7Var.m48934m(), su7Var.m48929h(), su7Var.m48924c());
        this.f47887t = new rla();
        this.f47888u = new rla();
        this.f47889v = new RectF();
        this.f47885r = su7Var.m48931j();
        this.f47890w = su7Var.m48927f();
        this.f47886s = su7Var.m48935n();
        this.f47891x = (int) (emaVar.m25327p().m17440d() / 32.0f);
        gc1 gc1VarMo24960a = su7Var.m48926e().mo24960a();
        this.f47892y = gc1VarMo24960a;
        gc1VarMo24960a.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a);
        gc1 gc1VarMo24960a2 = su7Var.m48933l().mo24960a();
        this.f47893z = gc1VarMo24960a2;
        gc1VarMo24960a2.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a2);
        gc1 gc1VarMo24960a3 = su7Var.m48925d().mo24960a();
        this.f47883A = gc1VarMo24960a3;
        gc1VarMo24960a3.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a3);
    }

    @Override // p001o.oe1, p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        super.mo20000d(obj, qmaVar);
        if (obj == mma.f35707L) {
            vri vriVar = this.f47884B;
            if (vriVar != null) {
                this.f38185f.m30176F(vriVar);
            }
            if (qmaVar == null) {
                this.f47884B = null;
                return;
            }
            vri vriVar2 = new vri(qmaVar);
            this.f47884B = vriVar2;
            vriVar2.m28369a(this);
            this.f38185f.m30184i(this.f47884B);
        }
    }

    @Override // p001o.oe1, p001o.dz5
    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        if (this.f47886s) {
            return;
        }
        mo20001e(this.f47889v, matrix, false);
        Shader shaderM50678k = this.f47890w == vu7.LINEAR ? m50678k() : m50679l();
        shaderM50678k.setLocalMatrix(matrix);
        this.f38188i.setShader(shaderM50678k);
        super.mo20002g(canvas, matrix, i);
    }

    @Override // p001o.j14
    public String getName() {
        return this.f47885r;
    }

    /* renamed from: i */
    public final int[] m50676i(int[] iArr) {
        vri vriVar = this.f47884B;
        if (vriVar != null) {
            Integer[] numArr = (Integer[]) vriVar.mo28376h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: j */
    public final int m50677j() {
        int iRound = Math.round(this.f47893z.m28374f() * this.f47891x);
        int iRound2 = Math.round(this.f47883A.m28374f() * this.f47891x);
        int iRound3 = Math.round(this.f47892y.m28374f() * this.f47891x);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* renamed from: k */
    public final LinearGradient m50678k() {
        long jM50677j = m50677j();
        LinearGradient linearGradient = (LinearGradient) this.f47887t.m46932c(jM50677j);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f47893z.mo28376h();
        PointF pointF2 = (PointF) this.f47883A.mo28376h();
        lu7 lu7Var = (lu7) this.f47892y.mo28376h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m50676i(lu7Var.m37893a()), lu7Var.m37894b(), Shader.TileMode.CLAMP);
        this.f47887t.m46936i(jM50677j, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: l */
    public final RadialGradient m50679l() {
        long jM50677j = m50677j();
        RadialGradient radialGradient = (RadialGradient) this.f47888u.m46932c(jM50677j);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f47893z.mo28376h();
        PointF pointF2 = (PointF) this.f47883A.mo28376h();
        lu7 lu7Var = (lu7) this.f47892y.mo28376h();
        int[] iArrM50676i = m50676i(lu7Var.m37893a());
        float[] fArrM37894b = lu7Var.m37894b();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), iArrM50676i, fArrM37894b, Shader.TileMode.CLAMP);
        this.f47888u.m46936i(jM50677j, radialGradient2);
        return radialGradient2;
    }
}
