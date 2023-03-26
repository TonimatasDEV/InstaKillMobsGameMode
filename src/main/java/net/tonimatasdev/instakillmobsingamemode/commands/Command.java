package net.tonimatasdev.instakillmobsingamemode.commands;

import net.tonimatasdev.devlib.api.command.SubCommand;
import net.tonimatasdev.instakillmobsingamemode.InstaKillMobs;
import net.tonimatasdev.instakillmobsingamemode.storage.PluginDescription;
import net.tonimatasdev.instakillmobsingamemode.storage.yml.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.ArrayList;

public class Command extends SubCommand {

    @Override
    public String getName() {
        return "instakillmobs";
    }

    @Override
    public ArrayList<SubCommand> getSubCommands() {
        return null;
    }

    @Override
    public String getPermission() {
        return null;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public boolean execute(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (sender.hasPermission("instakillmobsingamemode.command") || sender.hasPermission("instakillmobsingamemode.cmd")) {
            assert args != null;

            if (args.length > 1) {
                if (args[0].equalsIgnoreCase("creative")) {
                    if (args.length > 2) {
                        Player target = Bukkit.getPlayer(args[1]);

                        if (target == null) {
                            sender.sendMessage(PluginDescription.getPrefixPositive() + ("The player %target% isn't online.").replace("%target%", args[1]));
                        } else {
                            if (args.length == 3) {
                                if (args[2].equalsIgnoreCase("enable")) {

                                    List.getList().set("Players." + sender.getName() + ".InstaKillMobsInCreative", "true");
                                    List.saveList();
                                    List.reloadList();

                                    if (sender.getName().equals(target.getName())) {
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in creative is enabled for you");
                                    } else {
                                        sender.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in creative is:" + ChatColor.DARK_GREEN + " enabled" + ChatColor.WHITE + (" for %target%").replace("%target%", args[1]));
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in creative is enabled for you");
                                    }
                                }

                                if (args[2].equalsIgnoreCase("disable")) {
                                    List.getList().set("Players." + sender.getName() + ".InstaKillMobsInCreative", "false");
                                    List.saveList();
                                    List.reloadList();

                                    if (sender.getName().equals(target.getName())) {
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in creative is disabled for you");
                                    } else {
                                        sender.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in creative is:" + ChatColor.DARK_GREEN + " disabled" + ChatColor.WHITE + (" for %target%").replace("%target%", args[1]));
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in creative is disabled for you");
                                    }
                                }
                            } else {
                                sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode> <player> <disable/enable>");
                            }
                        }
                    } else {
                        sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode> <player> <disable/enable>");
                    }
                }

                if (args[0].equalsIgnoreCase("survival")) {
                    if (args.length > 2) {
                        Player target = Bukkit.getPlayer(args[1]);

                        if (target == null) {
                            sender.sendMessage(PluginDescription.getPrefixNegative() + ("The player %target% isn't online.").replace("%target%", args[1]));
                        } else {
                            if (args.length == 3) {
                                if (args[2].equalsIgnoreCase("enable")) {
                                    List.getList().set("Players." + sender.getName() + ".InstaKillMobsInSurvival", "true");
                                    List.saveList();
                                    List.reloadList();

                                    if (sender.getName().equals(target.getName())) {
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in survival is enabled for you");
                                    } else {
                                        sender.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in survival is:" + ChatColor.DARK_GREEN + " enable" + ChatColor.WHITE + (" for %target%").replace("%target%", args[1]));
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in survival is enabled for you");
                                    }
                                }

                                if (args[2].equalsIgnoreCase("disable")) {
                                    List.getList().set("Players." + sender.getName() + ".InstaKillMobsInSurvival", "false");
                                    List.saveList();
                                    List.reloadList();

                                    if (sender.getName().equals(target.getName())) {
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in survival is disabled for you");
                                    } else {
                                        sender.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in survival is:" + ChatColor.DARK_GREEN + " disabled" + ChatColor.WHITE + (" for %target%").replace("%target%", args[1]));
                                        target.sendMessage(PluginDescription.getPrefixNegative() + "Insta kill mobs in survival is disabled for you");
                                    }
                                }
                            } else {
                                sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode> <player> <disable/enable>");
                            }
                        }
                    } else {
                        sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode> <player> <disable/enable>");
                    }
                }

                if (args[0].equalsIgnoreCase("adventure")) {
                    if (args.length > 2) {
                        Player target = Bukkit.getPlayer(args[1]);

                        if (target == null) {
                            sender.sendMessage(PluginDescription.getPrefixNegative() + ("The player %target% isn't online.").replace("%target%", args[1]));
                        } else {
                            if (args[2].equalsIgnoreCase("enable")) {
                                List.getList().set("Players." + sender.getName() + ".InstaKillMobsInAdventure", "true");
                                List.saveList();
                                List.reloadList();

                                if (sender.getName().equals(target.getName())) {
                                    target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in adventure is enabled for you");
                                } else {
                                    sender.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in adventure is:" + ChatColor.DARK_GREEN + " enabled" + ChatColor.WHITE + (" for %target%").replace("%target%", args[1]));
                                    target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in adventure is enabled for you");
                                }
                            }

                            if (args.length == 3) {
                                if (args[2].equalsIgnoreCase("disable")) {
                                    List.getList().set("Players." + sender.getName() + ".InstaKillMobsInAdventure", "false");
                                    List.saveList();
                                    List.reloadList();

                                    if (sender.getName().equals(target.getName())) {
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in adventure is disabled for you");
                                    } else {
                                        sender.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in adventure is:" + ChatColor.DARK_GREEN + " disabled" + ChatColor.WHITE + (" for %target%").replace("%target%", args[1]));
                                        target.sendMessage(PluginDescription.getPrefixPositive() + "Insta kill mobs in adventure is disabled for you");
                                    }
                                }
                            } else {
                                sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode> <player> <disable/enable>");
                            }
                        }
                    } else {
                        sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode> <player> <disable/enable>");
                    }
                }

                if (args[0].equalsIgnoreCase("version")) {
                    sender.sendMessage(PluginDescription.getPrefixPositive() + PluginDescription.getVersion());
                }

                if (args[0].equalsIgnoreCase("reload")) {
                    sender.sendMessage(PluginDescription.getPrefixPositive() + "The plugin has been reloaded");
                    InstaKillMobs.getInstance().reloadConfig();
                    List.reloadList();
                }
            } else {
                sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode/reload/version>");
            }
        } else {
            sender.sendMessage(PluginDescription.getPrefixNegative() + "Please use: /instakillmobs <gamemode/reload/version>");
        }
        return true;
    }
}