package p001o;

import org.objectweb.asm.Opcodes;
import p001o.n6d;

/* loaded from: classes2.dex */
public final class dai implements klb {

    /* renamed from: a */
    public final f91 f19498a;

    public dai(f91 f91Var) {
        sq8.m48649h(f91Var, "staticMetadata");
        this.f19498a = f91Var;
    }

    @Override // p001o.klb
    /* renamed from: a */
    public void mo21637a(j7f j7fVar) {
        sq8.m48649h(j7fVar, "op");
        j7fVar.m33383c().m51144d().m40150e(this, n6d.EnumC15515a.After);
    }

    @Override // p001o.jlb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo21638b(zdc zdcVar, n64 n64Var) {
        f91 f91VarM26292a;
        zi4 zi4Var = (zi4) zdcVar.m59254c().mo18191b(zi4.f57243c.m59487c());
        if (zi4Var == null) {
            f91VarM26292a = this.f19498a;
        } else if (this.f19498a.m26293c() == null) {
            f91 f91Var = this.f19498a;
            f91VarM26292a = f91Var.m26292a((Opcodes.LAND & 1) != 0 ? f91Var.f22968a : null, (Opcodes.LAND & 2) != 0 ? f91Var.f22969b : null, (Opcodes.LAND & 4) != 0 ? f91Var.f22970c : null, (Opcodes.LAND & 8) != 0 ? f91Var.f22971d : null, (Opcodes.LAND & 16) != 0 ? f91Var.f22972e : null, (Opcodes.LAND & 32) != 0 ? f91Var.f22973f : null, (Opcodes.LAND & 64) != 0 ? f91Var.f22974g : null, (Opcodes.LAND & 128) != 0 ? f91Var.f22975h : zi4Var);
        } else {
            f91 f91Var2 = this.f19498a;
            f91VarM26292a = f91Var2.m26292a((Opcodes.LAND & 1) != 0 ? f91Var2.f22968a : null, (Opcodes.LAND & 2) != 0 ? f91Var2.f22969b : null, (Opcodes.LAND & 4) != 0 ? f91Var2.f22970c : null, (Opcodes.LAND & 8) != 0 ? f91Var2.f22971d : null, (Opcodes.LAND & 16) != 0 ? f91Var2.f22972e : null, (Opcodes.LAND & 32) != 0 ? f91Var2.f22973f : null, (Opcodes.LAND & 64) != 0 ? f91Var2.f22974g : null, (Opcodes.LAND & 128) != 0 ? f91Var2.f22975h : f91Var2.m26293c().m59484e(zi4Var));
        }
        ((z38) zdcVar.m59255d()).m58668e().m59810r("User-Agent", f91VarM26292a.m26295e());
        ((z38) zdcVar.m59255d()).m58668e().m59810r("x-amz-user-agent", f91VarM26292a.m26294d());
        return zdcVar;
    }
}
