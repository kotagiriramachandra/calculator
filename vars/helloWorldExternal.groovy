def call(Map config = [:]) {
  loadBatScript(name: 'hello_world.bat')
  bat "hello_world.bat ${config.name} ${config.dayOfWeek}"
}
