package gr.aueb.cf.ch17.knight;

@FunctionalInterface
public interface IKnight {

    IMission[] missions = {
            new KillTheDragonMission(),
            new SavethePrincesMission(),
            new KillTheDragonMission()
    };

    void embarkOnMission(IMission mission);
}
