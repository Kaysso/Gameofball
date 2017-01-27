#ifdef GL_ES
    precision mediump float;
#endif

varying vec2 v_texCoords;

uniform sampler2D u_texture;
uniform mat4 u_projTrans;

void main() {
    vec3 color = texture2D(u_texture, v_texCoords).rgb;
    gl_FragColor = vec4(color, 1.0);
}