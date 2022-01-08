package com.ddf.fakeplayer.container.slot;

public enum PlayerUISlot {
    CursorSelected(0x0),
    AnvilInput(0x1),
    AnvilMaterial(0x2),
    StoneCutterInput(0x3),
    Trade2Ingredient1(0x4),
    Trade2Ingredient2(0x5),
    TradeIngredient1(0x6),
    TradeIngredient2(0x7),
    MaterialReducerInput(0x8),
    LoomInput(0x9),
    LoomDye(0xA),
    LoomMaterial(0xB),
    CartographyInput(0xC),
    CartographyAdditional(0xD),
    EnchantingInput(0xE),
    EnchantingMaterial(0xF),
    GrindstoneInput(0x10),
    GrindstoneAdditional(0x11),
    CompoundCreatorInput1(0x12),
    CompoundCreatorInput2(0x13),
    CompoundCreatorInput3(0x14),
    CompoundCreatorInput4(0x15),
    CompoundCreatorInput5(0x16),
    CompoundCreatorInput6(0x17),
    CompoundCreatorInput7(0x18),
    CompoundCreatorInput8(0x19),
    CompoundCreatorInput9(0x1A),
    BeaconPayment(0x1B),
    Crafting2x2Input1(0x1C),
    Crafting2x2Input2(0x1D),
    Crafting2x2Input3(0x1E),
    Crafting2x2Input4(0x1F),
    Crafting3x3Input1(0x20),
    Crafting3x3Input2(0x21),
    Crafting3x3Input3(0x22),
    Crafting3x3Input4(0x23),
    Crafting3x3Input5(0x24),
    Crafting3x3Input6(0x25),
    Crafting3x3Input7(0x26),
    Crafting3x3Input8(0x27),
    Crafting3x3Input9(0x28),
    MaterialReducerOutput1(0x29),
    MaterialReducerOutput2(0x2A),
    MaterialReducerOutput3(0x2B),
    MaterialReducerOutput4(0x2C),
    MaterialReducerOutput5(0x2D),
    MaterialReducerOutput6(0x2E),
    MaterialReducerOutput7(0x2F),
    MaterialReducerOutput8(0x30),
    MaterialReducerOutput9(0x31),
    CreatedItemOutput(0x32),
    _count_17(0x33);

    private final int value;

    PlayerUISlot(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static PlayerUISlot getByValue(int value) {
        for (PlayerUISlot playerUISlot : values()) {
            if (playerUISlot.getValue() == value) {
                return playerUISlot;
            }
        }
        return PlayerUISlot._count_17;
    }
}
