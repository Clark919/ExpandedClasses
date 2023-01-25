# function loot_purse
execute if entity @s[nbt={Inventory:[{id:"clarks_classes:coin_purse"}]}] run loot give @s loot clarks-classes:generic/coin_purse
execute if entity @s[nbt={Inventory:[{id:"clarks_classes:coin_purse"}]}] run clear @s clarks_classes:coin_purse 1