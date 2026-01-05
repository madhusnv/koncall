package org.bouncycastle.jcajce.provider.symmetric;

import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-CMAC", str2);
        StringBuilder sbM9739m = AbstractC4801l.m9739m(str, "-CMAC", AbstractC5601a.m11238i("Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.", configurableProvider);
        sbM9739m.append(str);
        sbM9739m.append("-CMAC");
        configurableProvider.addAlgorithm(sbM9739m.toString(), str3);
        configurableProvider.addAlgorithm(AbstractC5601a.m11238i("Alg.Alias.KeyGenerator.", str, "CMAC"), str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder sbM9739m = AbstractC4801l.m9739m(str, "-GMAC", AbstractC5601a.m11238i("Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.", configurableProvider);
        sbM9739m.append(str);
        sbM9739m.append("-GMAC");
        configurableProvider.addAlgorithm(sbM9739m.toString(), str3);
        configurableProvider.addAlgorithm(AbstractC5601a.m11238i("Alg.Alias.KeyGenerator.", str, "GMAC"), str + "-GMAC");
    }

    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-" + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.POLY1305" + str, "POLY1305-" + str);
        configurableProvider.addAlgorithm("KeyGenerator.POLY1305-" + str, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305" + str, "POLY1305-" + str);
    }
}
