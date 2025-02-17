package cpw.mods.fml.common;

import cpw.mods.fml.common.network.EntitySpawnAdjustmentPacket;
import cpw.mods.fml.common.network.EntitySpawnPacket;
import cpw.mods.fml.common.network.ModMissingPacket;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket;
import net.minecraft.server.MinecraftServer;

import java.util.List;

public interface IFMLSidedHandler {
    List<String> getAdditionalBrandingInformation();

    Side getSide();

    void haltGame(String string, Throwable throwable);

    void showGuiScreen(Object object);

    Entity spawnEntityIntoClientWorld(EntityRegistry.EntityRegistration entityRegistration, EntitySpawnPacket entitySpawnPacket);

    void adjustEntityLocationOnClient(EntitySpawnAdjustmentPacket entitySpawnAdjustmentPacket);

    void beginServerLoading(MinecraftServer minecraftServer);

    void finishServerLoading();

    MinecraftServer getServer();

    void sendPacket(Packet arg);

    void displayMissingMods(ModMissingPacket modMissingPacket);

    void handleTinyPacket(PacketListener arg, MapUpdateS2CPacket arg2);

    void setClientCompatibilityLevel(byte b);

    byte getClientCompatibilityLevel();
}
