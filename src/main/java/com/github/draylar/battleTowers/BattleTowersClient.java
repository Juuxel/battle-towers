package com.github.draylar.battleTowers;

import com.github.draylar.battleTowers.common.entity.TowerGuardEntity;
import com.github.draylar.battleTowers.client.entity.towerguard.TowerGuardEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;

public class BattleTowersClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        EntityRendererRegistry.INSTANCE.register(TowerGuardEntity.class, ((entityRenderDispatcher, context) -> new TowerGuardEntityRenderer(entityRenderDispatcher)));
    }
}
