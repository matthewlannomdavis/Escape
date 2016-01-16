package view;

import model.Player;

public class ScreenLayout {
    private StatsPanel statsPanel = new view.StatsPanel();
    private ButtonPanel buttonPanel = new view.ButtonPanel();
    private BagPanel bagPanel = new view.BagPanel();
    private ProgressPanel progressPanel = new view.ProgressPanel();
    private DescriptionPanel descriptionPanel = new view.DescriptionPanel();

    public void Update(Player aPlayer) {
        statsPanel.update(aPlayer);
        buttonPanel.update(aPlayer);
        bagPanel.update(aPlayer);
        progressPanel.update(aPlayer);
        descriptionPanel.update(aPlayer);
    }
}
