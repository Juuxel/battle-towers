package com.github.draylar.battleTowers.client.entity.towerguard;

import com.github.draylar.battleTowers.common.entity.TowerGuardEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TowerGuardEntityRenderer extends MobEntityRenderer<TowerGuardEntity, TowerGuardEntityModel>
{
    public TowerGuardEntityRenderer(EntityRenderDispatcher entityRenderDispatcher)
    {
        super(entityRenderDispatcher, new TowerGuardEntityModel(), 1);
    }

    @Override
    protected Identifier getTexture(TowerGuardEntity towerGuardEntity)
    {
        return new Identifier("battle-towers:textures/entity/tower_guard/tower_guard.png");
    }
}
