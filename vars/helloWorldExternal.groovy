def call(Map config = [:]) {
  loadBatScript(name: 'hello_world.bat')
  bat "hellow_world.bat ${config.name} ${config.dayOfWeek}"
}
